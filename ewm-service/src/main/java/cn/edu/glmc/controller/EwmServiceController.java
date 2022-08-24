package cn.edu.glmc.controller;

import cn.edu.glmc.bean.Ewm;
import cn.edu.glmc.service.EwmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/24/15:25
 */
@RestController
public class EwmServiceController {
    @Autowired
    private EwmService ewmService;
    @RequestMapping("/selewm")
    List<Ewm> selewm(int qid){
        return ewmService.selewm(qid);
    }
    @RequestMapping("/selqyidbyewm")
    Ewm selqyidbyewm(int eid) {
        return ewmService.selqyidbyewm(eid);
    }

    @RequestMapping("/selqybysbr")
    Ewm selqybysbr(int eid) {
        return ewmService.selqybysbr(eid);
    }

    @RequestMapping("/selById")
    Ewm selById(int eid) {
        return ewmService.selById(eid);
    }

    @RequestMapping("/newewm")
    public boolean newewm(Ewm ew) {
        return ewmService.newewm(ew);
    }

    @RequestMapping("/upewm")
    public boolean upewm(Ewm ew) {
        return ewmService.upewm(ew);
    }

    @RequestMapping("/selxxwz")
    public String selxxwz(int eid) {
        return ewmService.selxxwz(eid);
    }
    @RequestMapping("/updQidyAdmin")
    public int updQidyAdmin(Integer qid, Integer startId, Integer endId) {
        return ewmService.updQidyAdmin(qid,startId,endId);
    }
}
