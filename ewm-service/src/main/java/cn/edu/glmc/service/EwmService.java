package cn.edu.glmc.service;

import cn.edu.glmc.bean.Ewm;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/20:00
 */
public interface EwmService {
    List<Ewm> selewm(int qid);
    Ewm selqyidbyewm(int eid);
    Ewm selqybysbr(int eid);
    boolean newewm(Ewm ew);
    boolean upewm(Ewm ew);
    //获得二维码的详细地点信息
    String selxxwz(int eid);
    Ewm selById(Integer eid);
    int updQidyAdmin(Integer qid, Integer startId, Integer endId);

}
