package com.jiguang.entity.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookInfo {

    private long id;
    /**
     * 书名
     */
    private String bookName;
    /**
     * 价格
     */
    private double bookPrice;
    /**
     * 库存
     */
    private int bookQuantity;
    /**
     * 作者
     */
    private String author;
    /**
     * 简介
     */
    private String bookDescription;
    /**
     * 图书编号
     */
    private String bookNum;


}
