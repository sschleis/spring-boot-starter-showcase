package de.dev.schleis.showcase.springbootstartershowcase;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyTestAutoconfiguration {

    @Bean
    @ConditionalOnMissingBean
    public MyConfigAdapter myConfigAdapter() {
        return new DefaultConfigAdapter();
    }
}
