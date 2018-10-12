package cn.funnyhuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**

 * @Description:    java类作用描述 基本的控制器请求

 * @Author:         HJ

 * @CreateDate:     2018/10/12 上午10:54

 * @UpdateUser:     HJ

 * @UpdateDate:     2018/10/12 上午10:54

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
@Controller
public class HomeController {

    @RequestMapping(value = "/getHome", method = RequestMethod.GET)
    public String home() throws Exception {
        return "home";
    }
}
