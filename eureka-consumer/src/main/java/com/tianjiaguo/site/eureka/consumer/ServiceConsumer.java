package com.tianjiaguo.site.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;

/**
 * TODO:
 *
 * @author tianjiaguo
 * @version 2018/9/8 下午10:42
 */
@SpringBootApplication
@EnableFeignClients
public class ServiceConsumer {
    @Bean
    ProtobufHttpMessageConverter protobufHttpMessageConverter() {
        return new ProtobufHttpMessageConverter();
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumer.class, args);
    }

}
