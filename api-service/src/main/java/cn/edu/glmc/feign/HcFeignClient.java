package cn.edu.glmc.feign;

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
    @RequestMapping("/HcServlet")
    @ResponseBody
    ResponseData hcServlet(@RequestParam("op") String op, @RequestParam(value = "mc", required = false) String mc,
                           @RequestParam(value = "dw", required = false) String dw, @RequestParam(value = "jg", required = false) String jg,
                           @RequestParam(value = "id", required = false) String id, @RequestParam(value = "lb", required = false) String lb,
                           @RequestParam(value = "xh", required = false) String xh, @RequestParam(value = "yjlb", required = false) String yjlb,
                           @RequestParam(value = "ejlb", required = false) String ejlb);
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
