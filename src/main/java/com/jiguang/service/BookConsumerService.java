package com.jiguang.service;

import com.jiguang.entity.book.BookInfo;
import com.jiguang.entity.messageQueue.BookOperationObeject;

public interface BookConsumerService {

    public BookInfo updateBookQuantity(BookOperationObeject operationObeject);

}
