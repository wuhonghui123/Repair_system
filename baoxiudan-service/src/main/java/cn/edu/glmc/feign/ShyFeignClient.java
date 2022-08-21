package cn.edu.glmc.feign;

import cn.edu.glmc.bean.Shy;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/21:30
 */
@FeignClient("shenheyuan-service")
@RequestMapping("/ShyService")
public interface ShyFeignClient {
    @GetMapping("/selallqy")
    List<Shy> selallqy();
    @GetMapping("/selOptimalShy")
    List<Shy> selOptimalShy(Integer eid);
    @GetMapping("/selqtShy")
    List<Shy> selqtShy(Integer eid);
    @GetMapping("/sellsqdshy")
    List<Shy> sellsqdshy(Integer eid);
}
