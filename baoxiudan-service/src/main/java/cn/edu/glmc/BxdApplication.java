package cn.edu.glmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/12:59
 */
@SpringBootApplication
//开启服务发现客户端
@EnableDiscoveryClient
//开启FeignClients远程调用的客户端
@EnableFeignClients
public class BxdApplication {
    public static void main(String[] args) {
        SpringApplication.run(BxdApplication.class, args);
    }
}
