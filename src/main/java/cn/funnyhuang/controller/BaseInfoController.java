package cn.funnyhuang.controller;


import cn.funnyhuang.model.BaseMessageInfoModel;
import cn.funnyhuang.service.BaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class BaseInfoController {

    private BaseInfoService baseInfoService;

    @Autowired
    BaseInfoController(BaseInfoService baseInfoService) {
        this.baseInfoService = baseInfoService;
    }

    @RequestMapping(value = "/baseInfo", method = RequestMethod.GET)
    String getInfoMessage(Model model) {
        List<BaseMessageInfoModel> infoModels = baseInfoService.findInfoModel(Long.MAX_VALUE, 20);
        model.addAttribute("infoList",infoModels);
        return "baseInfo";
    }

}
