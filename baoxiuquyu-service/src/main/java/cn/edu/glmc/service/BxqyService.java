package cn.edu.glmc.service;

import cn.edu.glmc.bean.Bxqy;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/19:53
 */
@Service
public interface BxqyService {
    Bxqy selbxqy(Integer id);
    List<Bxqy> selallqy();
    List<Bxqy> ditu(String xq);
    boolean newqy(Bxqy q);
    boolean upqy(Bxqy q);
    Bxqy selByEwmId(Integer eid);
}
