package cn.edu.glmc.controller.bxqy;

import cn.edu.glmc.feign.bxqy.BxqyFeignClient;
import cn.edu.glmc.response.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/22/15:50
 */
@RestController
public class BxqyController {
    @Autowired
    private BxqyFeignClient bxqyFeignClient;

    @RequestMapping("/BxqyServlet")
    @ResponseBody
    ResponseData bxqyServlet(@RequestParam("op")String op, @RequestParam(value = "qid", required = false) String qid){
        return bxqyFeignClient.bxqyServlet(op, qid);
    }
}
