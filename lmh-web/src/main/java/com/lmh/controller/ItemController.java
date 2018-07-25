package com.lmh.controller;

import com.lmh.item.itemclient.ItemClient;
import com.lmh.item.service.ItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PackageName: com.lmh.controller
 * FileName: ItemController.java
 * Description: TODO
 * Copyright: Copyright (c)2018
 * Company: yunjiglobal
 *
 * @author liaominghuikero@gmail.com
 * @version 1.0, 2018/7/25
 */
@RestController
public class ItemController {

    @Autowired
    private ItemClient itemClient;

    @GetMapping("/getItemInfo")
    public ItemDTO getItemInfo(int itemId) {
        return itemClient.getItemDetail(itemId);
    }
}
