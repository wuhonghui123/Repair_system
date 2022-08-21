package cn.edu.glmc.service.impl;

import cn.edu.glmc.bean.Jdr;
import cn.edu.glmc.service.JdrService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/20:12
 */
@Service
public class JdrServiceImpl implements JdrService {

    @Override
    public List<Jdr> selalljdr(List state) {
        return null;
    }

    @Override
    public List<Jdr> selNoQtjdr() {
        return null;
    }

    @Override
    public void del(String ybid) {

    }

    @Override
    public void newjdr(Jdr j) {

    }

    @Override
    public void upjdr(Jdr j) {

    }

    @Override
    public List<Jdr> selOptimaljdr(String bxlb, Integer eid) {
        return null;
    }

    @Override
    public List<Jdr> selOptimaljdrPC(String bxlb, Integer eid) {
        return null;
    }

    @Override
    public String selOpenidForYbid(String ybid) {
        return null;
    }

    @Override
    public int addOpenid(String id, String openid) {
        return 0;
    }

    @Override
    public Jdr selUser(String id) {
        return null;
    }

    @Override
    public List<Object> selOptimalBxlb() {
        return null;
    }
}
