package com.lmh.item.service;

import java.io.Serializable;

/**
 * PackageName: com.lmh.item.service
 * FileName: ItemDTO.java
 * Description: TODO
 * Copyright: Copyright (c)2018
 * Company: yunjiglobal
 *
 * @author liaominghuikero@gmail.com
 * @version 1.0, 2018/7/25
 */
public class ItemDTO implements Serializable {

    /**
     * 商品id
     */
    private Integer itemId;
    /**
     * 商品名称
     */
    private String itemName;


    public ItemDTO(Integer itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    public ItemDTO() {

    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
