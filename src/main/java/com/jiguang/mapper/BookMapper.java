package com.jiguang.mapper;

import com.jiguang.entity.book.BookInfo;
import com.jiguang.entity.messageQueue.BookOperationObeject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    List<BookInfo> listAllBooks();

    BookInfo getOneBook(String bookNum);

    void updateBookQuantity(BookOperationObeject operationObeject);
}
