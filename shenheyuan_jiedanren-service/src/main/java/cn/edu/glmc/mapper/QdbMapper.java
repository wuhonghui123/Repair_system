package cn.edu.glmc.mapper;

import cn.edu.glmc.bean.Qdb;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QdbMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Qdb record);

    int insertSelective(Qdb record);

    Qdb selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Qdb record);

    int updateByPrimaryKey(Qdb record);

    List<Qdb> selqdb(Qdb q);
    int qd(Qdb q);
    String selectOptimalXq(String shyid);
    String selectOptimalXqForShy(String shyid);
}
