package com.test;

import com.test.controller.TestController;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ConditionalOnClass(GirlFriendServiceInterface.class)
@EnableConfigurationProperties(GirlFriendProperties.class)
@Import({TestController.class})
public class GirlFriendConfigration {
    @Bean
    @ConditionalOnMissingBean
    public GirlFriendServiceInterface girlFriendServiceInterface() {
        return new GirlFriendServiceImpl();
    }

}
