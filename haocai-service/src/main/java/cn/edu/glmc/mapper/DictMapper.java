package cn.edu.glmc.mapper;


import cn.edu.glmc.bean.DictItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author lrt
 * @Date 2020/11/2 17:09
 * @Version 1.0
 **/
@Mapper
public interface DictMapper {
    List<DictItem> selectDictItemByCode(String dictCode);

    // 获取所有的报修类别id
    List<String> selAllDict();
    // 根据报修类别id获取名称
    String selDictNameForID(String id);
}
