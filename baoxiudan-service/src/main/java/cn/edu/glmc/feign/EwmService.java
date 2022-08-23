package cn.edu.glmc.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/23/12:42
 */
@FeignClient("ewm-service")
public interface EwmService {
}
