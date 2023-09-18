package com.Priyanka.url.BeanManager;

import com.Priyanka.url.Entity.UrlHitCounter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class BeanFactory {
    @Bean
    public List<UrlHitCounter> getUrlHitCounterList() {

        return new ArrayList<>();
    }
}
