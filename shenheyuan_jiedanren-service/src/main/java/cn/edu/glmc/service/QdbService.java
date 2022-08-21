package cn.edu.glmc.service;

import cn.edu.glmc.bean.Qdb;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/20:41
 */
public interface QdbService {
    List<Qdb> selallqy(Qdb q);
    boolean qd(Qdb q);
    String selectOptimalXq(String shyid);
    String selectOptimalXqForShy(String shyid);
}
