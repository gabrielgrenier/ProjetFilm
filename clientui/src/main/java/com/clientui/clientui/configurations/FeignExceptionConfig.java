package com.clientui.clientui.configurations;

import com.clientui.clientui.execeptions.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignExceptionConfig {

    @Bean
    public ErrorDecoder errorDecoder(){
        return new ErrorDecoder();
    }
}
