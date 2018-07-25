package com.lmh.item.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * PackageName: com.lmh.item
 * FileName: ItemController.java
 * Description: 商品服务
 * Copyright: Copyright (c)2018
 * Company: yunjiglobal
 *
 * @author liaominghuikero@gmail.com
 * @version 1.0, 2018/7/25
 */

@RestController(value = "item")
public class ItemController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/getItemDetail")
    public ItemDTO getItemDetail(int itemId) {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return new ItemDTO(itemId, "测试商品name");
    }

}
