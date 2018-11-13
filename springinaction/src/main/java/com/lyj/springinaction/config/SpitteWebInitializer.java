package com.lyj.springinaction.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

public class SpitteWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration){
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize("3000000KB");
        factory.setMaxRequestSize("6000000KB");
        factory.setLocation("./uploads");
        registration.setMultipartConfig(factory.createMultipartConfig());
    }
}
