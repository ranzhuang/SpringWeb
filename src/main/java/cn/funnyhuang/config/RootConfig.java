/**

* @Description:    配置ContextLoaderListener创建的应用上下文的bean

* @Author:         HJ

* @CreateDate:     2018/10/11 上午10:32

* @UpdateUser:     HJ

* @UpdateDate:     2018/10/11 上午10:32

* @UpdateRemark:   修改内容

* @Version:        1.0

*/
package cn.funnyhuang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"cn.funnyhuang"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {

}
