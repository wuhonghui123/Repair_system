package cn.edu.glmc.service.impl;

import cn.edu.glmc.bean.Bxd;
import cn.edu.glmc.bean.Jdr;
import cn.edu.glmc.mapper.BxdMapper;
import cn.edu.glmc.service.BxdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/21/16:12
 */
@Service
public class BxdServiceImpl implements BxdService {
    @Autowired
    private BxdMapper bxdMapper;
    @Override
    public List<Bxd> getBxdList() {
        return bxdMapper.getBxdList();
    }

    @Override
    public List<Bxd> selforsbr(Bxd bxd) {
        return null;
    }

    @Override
    public Bxd selbxdforshyid(Integer id) {
        return null;
    }

    @Override
    public List<Bxd> selbxdbyadmin(Bxd bxd) {
        return null;
    }

    @Override
    public List<Bxd> selbxdforeid(Integer eid) {
        return null;
    }

    @Override
    public List<Bxd> selbxdbyjdr(Bxd bxd) {
        return null;
    }

    @Override
    public List<Bxd> selbxdbyshy(Bxd bxd) {
        return null;
    }

    @Override
    public void upbxdbysbr(Bxd bxd) {

    }

    @Override
    public void upbxd1byshy(Bxd bxd) {

    }

    @Override
    public void upbxd2byshy(Bxd bxd) {

    }

    @Override
    public int upbxdhcbyshy(Bxd bxd) {
        return 0;
    }

    @Override
    public void upbxdbyadmin(Bxd bxd) {

    }

    @Override
    public void fg(Bxd bxd) {

    }

    @Override
    public void upbxdbyjdr(Bxd bxd) {

    }

    @Override
    public void del(Integer id) {

    }

    @Override
    public int newbxdbysbr(Bxd bxd) {
        return 0;
    }

    @Override
    public int selnumforstate(int b) {
        return 0;
    }

    @Override
    public int selnumforpj(int b) {
        return 0;
    }

    @Override
    public int allcount() {
        return 0;
    }

    @Override
    public Double selgs(String jid) {
        return null;
    }

    @Override
    public String tj() {
        return null;
    }

    @Override
    public int getsbrbxdnewid(String xh) {
        return 0;
    }

    @Override
    public List<Jdr> seljdrforpd() {
        return null;
    }

    @Override
    public int upbxdbyysr(Bxd bxd) {
        return 0;
    }

    @Override
    public int upBxdByExport(Bxd bxd) {
        return 0;
    }

    @Override
    public String selishc(Integer id) {
        return null;
    }

    @Override
    public Bxd selonebxd(Integer id) {
        return null;
    }

    @Override
    public List<Bxd> xxsjBxd() {
        return null;
    }

    @Override
    public List<Bxd> selwpdbxd() {
        return null;
    }

    @Override
    public List<Bxd> selBxdByMap(Map<String, Object> params) {
        return null;
    }

    @Override
    public int updateBatch(Map<String, Object> params) {
        return 0;
    }

    @Override
    public List<Bxd> selectBxdByIds(List<Integer> bxdIds) {
        return null;
    }

    @Override
    public int upBxdbStateBatch(List<Integer> bxdIds, String state) {
        return 0;
    }

    @Override
    public int getWpdNum() {
        return 0;
    }

    @Override
    public void upBxdById(Bxd bxd) {

    }

    @Override
    public String bxdRemore(HttpServletResponse response) {
        return null;
    }

    @Override
    public String downloadBxdRemore(HttpServletResponse response) {
        return null;
    }
}
