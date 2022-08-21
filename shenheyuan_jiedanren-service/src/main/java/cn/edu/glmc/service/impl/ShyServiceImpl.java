package cn.edu.glmc.service.impl;

import cn.edu.glmc.bean.Shy;
import cn.edu.glmc.service.ShyService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/16:58
 */
@Service
public class ShyServiceImpl implements ShyService {
    @Override
    public List<Shy> selallqy() {
        return null;
    }

    @Override
    public String del(String ybid) {

        return ybid;
    }

    @Override
    public void newshy(Shy s) {

    }

    @Override
    public void UPshy(Shy s) {

    }

    @Override
    public List<Shy> selOptimalShy(Integer eid) {
        return null;
    }

    @Override
    public List<Shy> selqtShy(Integer eid) {
        return null;
    }

    @Override
    public List<Shy> sellsqdshy(Integer eid) {
        return null;
    }

    @Override
    public Shy selOneShy(String ybid) {
        return null;
    }
}
