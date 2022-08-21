package cn.edu.glmc.mapper;

import cn.edu.glmc.bean.Bxd;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/16:10
 */
@Mapper
public interface BxdMapper {
    List<Bxd> getBxdList();
}
