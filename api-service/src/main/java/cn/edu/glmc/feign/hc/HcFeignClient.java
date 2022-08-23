package cn.edu.glmc.feign.hc;

import cn.edu.glmc.config.OpenFeignConfig;
import cn.edu.glmc.response.ResponseData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/22/15:52
 */
@FeignClient(value = "haocai-service", configuration = OpenFeignConfig.class)
public interface HcFeignClient {
    /**
     * 根据一级类别和二级类别获取耗材表的数据
     */
    @ResponseBody
    @RequestMapping("/HcServlet/selHcByLb")
    ResponseData selHcByLb(@RequestParam String yjlb, @RequestParam String ejlb);

    /**
     * 插入一条耗材数据
     */
    @ResponseBody
    @RequestMapping("/HcServlet/newhc")
    ResponseData newhc(@RequestParam String mc, @RequestParam String dw, @RequestParam String jg, @RequestParam String lb, @RequestParam String xh);

    /**
     * 更新一条耗材数据
     */
    @ResponseBody
    @RequestMapping("/HcServlet/uphc")
    ResponseData uphc(@RequestParam String id, @RequestParam String mc, @RequestParam String dw, @RequestParam String jg, @RequestParam String lb, @RequestParam String xh);

    /**
     * 删除一条耗材数据
     */
    @RequestMapping("/HcServlet/delhc")
    ResponseData delhc(String id);

    /**
     * 查询所有耗材表的数据
     */
    @RequestMapping("/HcServlet/selhc")
    ResponseData selhc();

    @RequestMapping(value = "/insertHcBatch", method = RequestMethod.POST)
    public ResponseData insertHcBatch(@RequestParam(value = "hcFile", required = false) MultipartFile hcFile);

    @RequestMapping("/downloadHcTemplate")
    public String downloadHcTemplate(HttpServletResponse response);

    /**
     * 获取维修类别
     * 根据字符串解析为中文
     */
    @RequestMapping(value = "/getAllWxlb",method = RequestMethod.GET)
    public ResponseData getAllWxlb();
}
