package cn.edu.glmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/22/15:42
 */
@SpringBootApplication
//开启服务发现客户端
@EnableDiscoveryClient
//开启FeignClients远程调用的客户端
@EnableFeignClients
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
