import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * PackageName: com.lmh.controller
 * FileName: WebApplication.java
 * Description: TODO
 * Copyright: Copyright (c)2018
 * Company: yunjiglobal
 *
 * @author liaominghuikero@gmail.com
 * @version 1.0, 2018/7/25
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan("com.lmh.item.itemclient")
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
