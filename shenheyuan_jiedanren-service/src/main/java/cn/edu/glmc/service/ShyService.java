package cn.edu.glmc.service;

import cn.edu.glmc.bean.Shy;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/16:58
 */
public interface ShyService {
    List<Shy> selallqy();
    String del(String ybid);
    void newshy(Shy s);
    void UPshy(Shy s);
    List<Shy> selOptimalShy(Integer eid);
    List<Shy> selqtShy(Integer eid);
    List<Shy> sellsqdshy(Integer eid);
    Shy selOneShy(String ybid);
}
