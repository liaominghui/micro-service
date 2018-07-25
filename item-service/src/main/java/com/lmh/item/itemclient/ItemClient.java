package com.lmh.item.itemclient;

import com.lmh.item.service.ItemDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * PackageName: com.lmh.item.itemclient
 * FileName: ItemClient.java
 * Description: TODO
 * Copyright: Copyright (c)2018
 * Company: yunjiglobal
 *
 * @author liaominghuikero@gmail.com
 * @version 1.0, 2018/7/25
 */
@FeignClient("item-service")
public interface ItemClient {

    @RequestMapping(method = RequestMethod.GET, value = "/getItemDetail")
    public ItemDTO getItemDetail(@RequestParam("itemId") Integer itemId);

}
