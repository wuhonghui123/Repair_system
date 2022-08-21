package cn.edu.glmc.service.impl;

import cn.edu.glmc.bean.Qdb;
import cn.edu.glmc.service.QdbService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/20:41
 */
@Service
public class QdbServiceImpl implements QdbService {
    @Override
    public List<Qdb> selallqy(Qdb q) {
        return null;
    }

    @Override
    public boolean qd(Qdb q) {
        return false;
    }

    @Override
    public String selectOptimalXq(String shyid) {
        return null;
    }

    @Override
    public String selectOptimalXqForShy(String shyid) {
        return null;
    }
}
