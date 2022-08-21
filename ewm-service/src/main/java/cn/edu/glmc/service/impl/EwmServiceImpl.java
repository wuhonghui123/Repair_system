package cn.edu.glmc.service.impl;

import cn.edu.glmc.bean.Ewm;
import cn.edu.glmc.service.EwmService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/20:01
 */
@Service
public class EwmServiceImpl implements EwmService {
    @Override
    public List<Ewm> selewm(int qid) {
        return null;
    }

    @Override
    public Ewm selqyidbyewm(int eid) {
        return null;
    }

    @Override
    public Ewm selqybysbr(int eid) {
        return null;
    }

    @Override
    public boolean newewm(Ewm ew) {
        return false;
    }

    @Override
    public boolean upewm(Ewm ew) {
        return false;
    }

    @Override
    public String selxxwz(int eid) {
        return null;
    }

    @Override
    public Ewm selById(Integer eid) {
        return null;
    }

    @Override
    public int updQidyAdmin(Integer qid, Integer startId, Integer endId) {
        return 0;
    }
}
