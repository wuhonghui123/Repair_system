package cn.edu.glmc.controller.bxd;

import cn.edu.glmc.feign.bxd.BxdFeignClient;
import cn.edu.glmc.http.HttpResult;
import feign.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/22/15:46
 */
@RestController
public class BxdController {
    @Autowired
    private BxdFeignClient bxdFeignClient;


    @GetMapping("/bxd/getbxdlist")
    public HttpResult deleteClassificationList(){
        return HttpResult.ok(bxdFeignClient.getBxdList());
    }

    @GetMapping("/test")
    public String test(){
        return this.bxdFeignClient.test();
    }
}
