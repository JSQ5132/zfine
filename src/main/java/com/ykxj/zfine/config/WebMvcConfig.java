//package com.ykxj.zfine.config;
//
//import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
///**
// * @author JiangShengQiang
// * @date 2020/11/17 11:52
// * @desc
// */
//public class WebMvcConfig implements WebMvcConfigurer {
//    /**
//     * 重新指定静态资源
//     *
//     * @param registry
//     */
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/statics/**").addResourceLocations("classpath:/statics/");
//        // 解决 SWAGGER2 404报错
//        registry.addResourceHandler("/swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }
//
//    /**
//     * 配置servlet处理
//     */
//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }
//
//}
