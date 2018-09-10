package com.tianjiaguo.site.eureka.provider;

import com.tianjiaguo.site.eureka.converter.ProtobufJsonFormatHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;

/**
 * TODO:
 *
 * @author tianjiaguo
 * @version 2018/9/7 下午8:16
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients /*(defaultConfiguration = ClientsConfiguration.class)*/
public class ServiceProvider {
    //    @Bean
//    ProtobufHttpMessageConverter protobufHttpMessageConverter() {
//        return new ProtobufHttpMessageConverter();
//    }
    @Bean
    AbstractHttpMessageConverter protobufHttpMessageConverter() {
        return new ProtobufJsonFormatHttpMessageConverter();
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceProvider.class, args);
    }

}
