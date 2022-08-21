package cn.edu.glmc.controller;

import cn.edu.glmc.bean.Shy;
import cn.edu.glmc.http.HttpResult;
import cn.edu.glmc.service.ShyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/17:06
 */
@RequestMapping("/ShyService")
@RestController
public class ShyServiceController {
    @Autowired
    private ShyService shyService;
    @GetMapping("/selallqy")
    List<Shy> selallqy(){
        return shyService.selallqy();
    }
    @GetMapping("/selOptimalShy")
    List<Shy> selOptimalShy(Integer eid){
        return shyService.selOptimalShy(eid);
    }
    @GetMapping("/selqtShy")
    List<Shy> selqtShy(Integer eid){
        return shyService.selqtShy(eid);
    }
    @GetMapping("/sellsqdshy")
    List<Shy> sellsqdshy(Integer eid){
        return shyService.sellsqdshy(eid);
    }
}
