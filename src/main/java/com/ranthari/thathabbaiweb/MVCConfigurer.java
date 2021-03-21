package com.ranthari.thathabbaiweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
public class MVCConfigurer extends WebMvcConfigurationSupport {
    
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
	InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	resolver.setPrefix("/WEB-INF/jsp/");
	resolver.setSuffix(".jsp");
	resolver.setViewClass(JstlView.class);
	registry.viewResolver(resolver);
    }
    
}
