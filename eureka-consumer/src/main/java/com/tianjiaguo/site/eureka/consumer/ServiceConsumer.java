package com.tianjiaguo.site.eureka.consumer;

import com.tianjiaguo.site.eureka.converter.ProtobufJsonFormatHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.AbstractHttpMessageConverter;

/**
 * TODO:
 *
 * @author tianjiaguo
 * @version 2018/9/8 下午10:42
 */
@SpringBootApplication
@EnableFeignClients
public class ServiceConsumer {
    //    @Bean
//    ProtobufHttpMessageConverter protobufHttpMessageConverter() {
//        return new ProtobufHttpMessageConverter();
//    }
    @Bean
    AbstractHttpMessageConverter protobufHttpMessageConverter() {
        return new ProtobufJsonFormatHttpMessageConverter();
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumer.class, args);
    }
}
