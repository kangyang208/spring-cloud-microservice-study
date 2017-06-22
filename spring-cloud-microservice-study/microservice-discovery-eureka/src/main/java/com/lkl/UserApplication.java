/**
 * 澳洋信息系统微信台平台
 * Date:2017年06月22日
 * Copyright(c) 2016 All Rights Reserved
 */
package com.lkl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @desc
 * @author: YangKang
 */
@SpringBootApplication
@EnableEurekaServer
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(com.lkl.UserApplication.class, args);
    }
}