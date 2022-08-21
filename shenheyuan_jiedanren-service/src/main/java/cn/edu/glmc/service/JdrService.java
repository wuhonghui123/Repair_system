package cn.edu.glmc.service;

import cn.edu.glmc.bean.Jdr;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/20:12
 */
public interface JdrService {
    List<Jdr> selalljdr(List state);
    List<Jdr> selNoQtjdr();
    void del(String ybid);
    void newjdr(Jdr j);
    void upjdr(Jdr j);
    List<Jdr> selOptimaljdr(String bxlb, Integer eid);
    List<Jdr> selOptimaljdrPC(String bxlb, Integer eid);
    String selOpenidForYbid(String ybid);
    int addOpenid(String id,String openid);
    Jdr selUser(String id);
    List<Object> selOptimalBxlb();
}
