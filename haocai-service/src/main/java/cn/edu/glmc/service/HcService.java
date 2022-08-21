package cn.edu.glmc.service;

import cn.edu.glmc.bean.Hc;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/20:09
 */
public interface HcService {
    List<Hc> selall();
    List<Hc> selHcByLb(String yjlb, String ejlb);
    Hc selOneHc(Integer id);
    int delhc(int id);
    int newhc(Hc h);
    int uphc(Hc h);
    int insertHcBatch(List<Hc> hcDataList);
}
