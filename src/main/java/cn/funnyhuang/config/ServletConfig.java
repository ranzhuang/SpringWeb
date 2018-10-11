/**

* @Description:    用来定义DispatcherServlet应用上下文的bean

* @Author:         HJ

* @CreateDate:     2018/10/11 上午10:31

* @UpdateUser:     HJ

* @UpdateDate:     2018/10/11 上午10:31

* @UpdateRemark:   修改内容

* @Version:        1.0

*/
package cn.funnyhuang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
/**
 * EnableWebMvc注解存在的问题：
 * 1: 没有配置视图解析器
 * 2: 没有开启组件扫描
 * 3: DispatcherServlet会映射默认的servlet，所以会处理所有的请求，包括对静态资源的请求，比如图片和样式表等
 */
@EnableWebMvc
/**
 * 启动组件扫描
 */
@ComponentScan(basePackages = {"cn.funnyhuang.controller"})
public class ServletConfig implements WebMvcConfigurer {

    /**
     * 配置JSP视图解析器
     * @return
     */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        //设置前缀
        resolver.setPrefix("WEB-INF/views/");
        //设置后缀
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    /**
     * 配置静态资源的处理
     * 实现WebMvcConfigurer的configureDefaultServletHandling方法
     *
     * @param configurer
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        //要求DispatchServlet将对静态的资源请求转发到Servlet容器默认的servlet中，
        //而不是使用DispatchServlet本身来处理此请求。
        configurer.enable();
    }
}
