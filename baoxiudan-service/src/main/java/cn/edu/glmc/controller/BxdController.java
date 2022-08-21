package cn.edu.glmc.controller;

import cn.edu.glmc.http.HttpResult;
import cn.edu.glmc.service.BxdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/16:13
 */
@RestController
public class BxdController {
    @Autowired
    private BxdService bxdService;
    @GetMapping("/bxd/getbxdlist")
    public HttpResult deleteClassificationList(){
        return HttpResult.ok(bxdService.getBxdList());
    }
}
