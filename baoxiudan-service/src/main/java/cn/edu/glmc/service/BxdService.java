package cn.edu.glmc.service;

import cn.edu.glmc.bean.Bxd;
import cn.edu.glmc.bean.Jdr;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/16:11
 */
public interface BxdService {
    List<Bxd> getBxdList();
    List<Bxd> selforsbr(Bxd bxd);

    Bxd selbxdforshyid(Integer id);

    List<Bxd> selbxdbyadmin(Bxd bxd);

    List<Bxd> selbxdforeid(Integer eid);

    List<Bxd> selbxdbyjdr(Bxd bxd);

    List<Bxd> selbxdbyshy(Bxd bxd);

    void upbxdbysbr(Bxd bxd);

    void upbxd1byshy(Bxd bxd);

    void upbxd2byshy(Bxd bxd);

    int upbxdhcbyshy(Bxd bxd);

    void upbxdbyadmin(Bxd bxd);

    void fg(Bxd bxd);

    void upbxdbyjdr(Bxd bxd);

    void del(Integer id);

    int newbxdbysbr(Bxd bxd);

    int selnumforstate(int b);

    int selnumforpj(int b);

    int allcount();

    Double selgs(String jid);

    String tj();

    int getsbrbxdnewid(String xh);

    List<Jdr> seljdrforpd();

    int upbxdbyysr(Bxd bxd);

    // 报修单导出后不再允许导出
    int upBxdByExport(Bxd bxd);

    String selishc(Integer id);

    Bxd selonebxd(Integer id);

    //未上班时间申报的报修单
    List<Bxd> xxsjBxd();

    //查询未派单的报修单 wpd=未派单
    List<Bxd> selwpdbxd();

    List<Bxd>  selBxdByMap(Map<String, Object> params);

    int updateBatch(Map<String, Object> params);

    // 查询某个状态的所有报修单
    List<Bxd> selectBxdByIds(List<Integer> bxdIds);

    // 批量更新已维修报修单为已验收状态
    int upBxdbStateBatch(List<Integer> bxdIds, String state);

    //获取未派单的数量
    int getWpdNum();

    //根据id更新保修单信息
    void upBxdById(Bxd bxd);

    //清除一年前的报修记录
    String bxdRemore(HttpServletResponse response);
    // 下载备份报修单
    String downloadBxdRemore(HttpServletResponse response);
}
