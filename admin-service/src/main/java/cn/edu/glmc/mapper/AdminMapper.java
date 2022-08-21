package cn.edu.glmc.mapper;


import org.apache.ibatis.annotations.Mapper;
import cn.edu.glmc.bean.Admin;

@Mapper
public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    Admin login(Admin a);


}
