package ks44team04.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import ks44team04.interceptor.CommonInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    private final CommonInterceptor commonInterceptor;

    public WebConfig(CommonInterceptor commonInterceptor) {
        this.commonInterceptor = commonInterceptor;
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(commonInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/error/**")
                .excludePathPatterns("/vendors/**")
                .excludePathPatterns("/user/vendors/**")
                .excludePathPatterns("/images/**")
                .excludePathPatterns("/build/**")
                .excludePathPatterns("/user/css/**")
                .excludePathPatterns("/user/images/**")
                .excludePathPatterns("/user/address/images/**")
                .excludePathPatterns("/user/fonts/**")
                .excludePathPatterns("/user/js/**")
                .excludePathPatterns("/favicon.ico");

        WebMvcConfigurer.super.addInterceptors(registry);
    }


}
