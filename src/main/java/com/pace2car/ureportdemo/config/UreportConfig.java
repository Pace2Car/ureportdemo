package com.pace2car.ureportdemo.config;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import javax.servlet.Servlet;

/**
 * Ureport servlet配置
 * @author Pace2Car
 * @since 2020/10/26 17:46
 */
@Configuration
@ImportResource("classpath:ureport-console-context.xml") // 加载ureport对应的xml配置文件
public class UreportConfig {
    /**
     * ureport2报表Servlet配置
     */
    @Bean
    public ServletRegistrationBean<Servlet> ureport2Servlet(){
        return new ServletRegistrationBean<>(new UReportServlet(), "/ureport/*");
    }
}
