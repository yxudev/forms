package com.yishan.forms.config;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;


import static org.slf4j.LoggerFactory.getLogger;

@Configuration
@ComponentScan(basePackages = "com.yishan.forms",
        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX,pattern = "com.yishan.forms.api.*"))
public class AppConfig {

//    @Autowired
//    private Environment environment;
//    private final Logger logger = getLogger(getClass());
//    @Value("${queueName}")
//    private String queueName;
//
//    @Bean(name = "applicationProperties")
//    public PropertiesFactoryBean getDbProperties() {
//        PropertiesFactoryBean bean = new PropertiesFactoryBean();
//        String profile = environment.getActiveProfiles()[0];
//        logger.debug("applicationProperties is " + profile);
//        bean.setLocation(new ClassPathResource("META-INF/env/application-" + profile + ".properties"));
//        return bean;
//    }
//
//    @Bean(name = "shareProperties")
//    public PropertiesFactoryBean getSharedProperties() {
//        PropertiesFactoryBean shareProperties = new PropertiesFactoryBean();
//        shareProperties.setLocation(new ClassPathResource("META-INF/share-runtime.properties"));
//        return shareProperties;
//    }
}

