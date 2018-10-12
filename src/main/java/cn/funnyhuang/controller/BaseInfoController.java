package cn.funnyhuang.controller;


import cn.funnyhuang.model.BaseMessageInfoModel;
import cn.funnyhuang.service.BaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
/**

 * @Description:    java类作用描述 基于模型的控制器请求

 * @Author:         HJ

 * @CreateDate:     2018/10/12 上午10:54

 * @UpdateUser:     HJ

 * @UpdateDate:     2018/10/12 上午10:54

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
@Controller
public class BaseInfoController {

    @Autowired
    private BaseInfoService baseInfoService;

    @RequestMapping(value = "/baseInfo", method = RequestMethod.GET)
    String getInfoMessage(Model model) {
        List<BaseMessageInfoModel> infoModels = baseInfoService.findInfoModel(Long.MAX_VALUE, 20);
        model.addAttribute("infoList",infoModels);
        return "baseInfo";
    }

}
