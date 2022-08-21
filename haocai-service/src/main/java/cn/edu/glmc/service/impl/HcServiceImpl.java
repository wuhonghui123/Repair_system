package cn.edu.glmc.service.impl;

import cn.edu.glmc.bean.Hc;
import cn.edu.glmc.service.HcService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/20:09
 */
@Service
public class HcServiceImpl implements HcService {
    @Override
    public List<Hc> selall() {
        return null;
    }

    @Override
    public List<Hc> selHcByLb(String yjlb, String ejlb) {
        return null;
    }

    @Override
    public Hc selOneHc(Integer id) {
        return null;
    }

    @Override
    public int delhc(int id) {
        return 0;
    }

    @Override
    public int newhc(Hc h) {
        return 0;
    }

    @Override
    public int uphc(Hc h) {
        return 0;
    }

    @Override
    public int insertHcBatch(List<Hc> hcDataList) {
        return 0;
    }
}
