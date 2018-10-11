/**

* @Description:    配置DispatcherServlet

* @Author:         HJ

* @CreateDate:     2018/10/11 上午10:06

* @UpdateUser:     HJ

* @UpdateDate:     2018/10/11 上午10:06

* @UpdateRemark:   修改内容

* @Version:        1.0

*/
package cn.funnyhuang.config;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //指定配置类
        return new Class[] {ServletConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        //将DispatcherServlet映射到"/"
        return new String[] {"/"};
    }
}
