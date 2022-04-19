package com.jiguang.entity.messageQueue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookOperationObeject implements Serializable {

    /**
     * 操作类型(0:减少，1:增加)
     */
    private int operationType;
    /**
     * 更新数量
     */
    private int updateQuantity;
    /**
     * 图书编号
     */
    private String bookNum;

}

