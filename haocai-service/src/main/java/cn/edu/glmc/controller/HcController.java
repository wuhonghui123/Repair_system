package cn.edu.glmc.controller;

import cn.edu.glmc.response.ResponseData;
import cn.edu.glmc.service.HcBatchService;
import cn.edu.glmc.service.HcService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @Author: wuhonghui
 * @Date: 2022/08/23/12:11
 */
@RestController
public class HcController {
    @RequestMapping("/HcServlet")
    @ResponseBody
    ResponseData hcServlet(@RequestParam("op") String op, @RequestParam(value = "mc", required = false) String mc,
                           @RequestParam(value = "dw", required = false) String dw, @RequestParam(value = "jg", required = false) String jg,
                           @RequestParam(value = "id", required = false) String id, @RequestParam(value = "lb", required = false) String lb,
                           @RequestParam(value = "xh", required = false) String xh, @RequestParam(value = "yjlb", required = false) String yjlb,
                           @RequestParam(value = "ejlb", required = false) String ejlb) {
        if (StringUtils.isWhitespace(op) || StringUtils.isEmpty(op) || StringUtils.isBlank(op))
            return new ResponseData("2");
        switch (op) {
            case "selhc":

            case "delhc":

            case "newhc":

            case "uphc":

            case "selHcByLb":

            default:
                return new ResponseData(false);
        }
    }
    @RequestMapping(value = "/insertHcBatch", method = RequestMethod.POST)
    public ResponseData insertHcBatch(@RequestParam(value = "hcFile", required = false) MultipartFile hcFile) {
        return new ResponseData("上传失败！");
    }

}
