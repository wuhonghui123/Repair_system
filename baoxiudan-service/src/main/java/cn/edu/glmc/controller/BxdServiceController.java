package cn.edu.glmc.controller;

import cn.edu.glmc.bean.Bxd;
import cn.edu.glmc.service.BxdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/21:42
 */
@RestController
@RequestMapping("/bxdservice")
public class BxdServiceController {
    @Autowired
    private BxdService bxdService;

    @GetMapping("/allcount")
    int allcount(){
        return bxdService.allcount();
    }

    @GetMapping("/selnumforstate")
    int selnumforstate(int b){
        return bxdService.selnumforstate(b);
    }

    @GetMapping("/selnumforpj")
    int selnumforpj(int b){
        return bxdService.selnumforpj(b);
    }

    @GetMapping("/selonebxd")
    Bxd selonebxd(int id){
        return bxdService.selonebxd(id);
    }

    @GetMapping("/del")
    void del(int id){
        bxdService.del(id);
    }

    @GetMapping("/upbxdbyadmin")
    void upbxdbyadmin(Bxd bxd){
        bxdService.upbxdbyadmin(bxd);
    }

    @GetMapping("/selbxdbyadmin")
    List<Bxd> selbxdbyadmin(Bxd bxd){
        return bxdService.selbxdbyadmin(bxd);
    }

    @GetMapping("/upBxdByExport")
    int upBxdByExport(Bxd bxd){
        return bxdService.upBxdByExport(bxd);
    }

    @GetMapping("/selgs")
    Double selgs(String jid){
        return bxdService.selgs(jid);
    }

    @GetMapping("/selishc")
    String selishc(Integer jid){
        return bxdService.selishc(jid);
    }

    @GetMapping("/upbxdbyjdr")
    void upbxdbyjdr(Bxd bxd){
        bxdService.upbxdbyjdr(bxd);
    }

    @GetMapping("/selbxdforshyid")
    Bxd selbxdforshyid(Integer id){
        return bxdService.selbxdforshyid(id);
    }

    @GetMapping("/selbxdbyjdr")
    List<Bxd> selbxdbyjdr(Bxd bxd){
        return bxdService.selbxdbyjdr(bxd);
    }

    @GetMapping("/upbxdhcbyshy")
    int upbxdhcbyshy(Bxd bxd){
        return bxdService.upbxdhcbyshy(bxd);
    }

    @GetMapping("/upbxd1byshy")
    void upbxd1byshy(Bxd bxd){
        bxdService.upbxd1byshy(bxd);
    }

    @GetMapping("/upbxd2byshy")
    void upbxd2byshy(Bxd bxd){
        bxdService.upbxd2byshy(bxd);
    }

    @GetMapping("/upbxdbyysr")
    void upbxdbyysr(Bxd bxd){
        bxdService.upbxdbyysr(bxd);
    }

    @GetMapping("/selectBxdByIds")
    List<Bxd> selectBxdByIds(List<Integer> bxdIds){
        return bxdService.selectBxdByIds(bxdIds);
    }

    @GetMapping("/upBxdbStateBatch")
    int upBxdbStateBatch(List<Integer> bxdIds,String state){
        return bxdService.upBxdbStateBatch(bxdIds,state);
    }

    @GetMapping("/upBxdById")
    void upBxdById(Bxd bxd){
        bxdService.upBxdById(bxd);
    }

    @GetMapping("/selbxdbyshy")
    List<Bxd> selbxdbyshy(Bxd bxd){
        return bxdService.selbxdbyshy(bxd);
    }


}
