package cn.edu.glmc.feign.bxd;

import cn.edu.glmc.bean.Bxd;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.edu.glmc.config.OpenFeignConfig;
import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/22/15:46
 */
@FeignClient(value = "baoxiudan-service", configuration = OpenFeignConfig.class)
public interface BxdFeignClient {
    @GetMapping("/bxd/getbxdlist")
    List<Bxd> getBxdList();

    @GetMapping("/test")
    String test();
}
