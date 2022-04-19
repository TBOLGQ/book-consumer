package com.jiguang.service.impl;

import com.alibaba.fastjson.JSON;
import com.jiguang.entity.book.BookInfo;
import com.jiguang.entity.messageQueue.BookOperationObeject;
import com.jiguang.mapper.BookMapper;
import com.jiguang.service.BookConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@RocketMQMessageListener(topic = "book_quantity_update", consumerGroup = "book-consumer")
@Component
public class BookConsumerServiceImpl implements BookConsumerService, RocketMQListener<String> {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public BookInfo updateBookQuantity(BookOperationObeject operationObeject) {
        if (null != operationObeject) {
            bookMapper.updateBookQuantity(operationObeject);
        }

        BookInfo book = bookMapper.getOneBook(operationObeject.getBookNum());
        if (null == book) {
            book = new BookInfo();
        }
        return book;
    }

    @Override
    public void onMessage(String s) {
        log.info("topic:{},拉取到消息:{}", "book_quantity_update", s);

        BookOperationObeject operationObeject = JSON.parseObject(s, BookOperationObeject.class);
        BookInfo bookInfo = this.updateBookQuantity(operationObeject);

        log.info("[图书信息]-[修改mysql库存]-完成,剩余库存:{}", bookInfo.getBookQuantity());
    }

}
