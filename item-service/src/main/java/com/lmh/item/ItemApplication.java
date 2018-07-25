package com.lmh.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * PackageName: com.lmh.item
 * FileName: ItemApplication.java
 * Description: 商品服务
 * Copyright: Copyright (c)2018
 * Company: yunjiglobal
 *
 * @author liaominghuikero@gmail.com
 * @version 1.0, 2018/7/25
 */
@SpringBootApplication
@EnableEurekaClient
public class ItemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemApplication.class, args);
    }

}
