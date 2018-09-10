package com.tianjiaguo.site.eureka.consumer.service;

import com.tianjiaguo.site.eureka.model.HelloWordReq;
import com.tianjiaguo.site.eureka.model.HelloWordRsp;
import com.tianjiaguo.site.eureka.model.Result;
import com.tianjiaguo.site.eureka.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * TODO:
 *
 * @author tianjiaguo
 * @version 2018/9/8 下午10:36
 */
@FeignClient(name = "guoguo-service")
public interface HelloWord {
    @PostMapping(value = "/hello-word/create")
    public Result<HelloWordRsp> helloWord(@RequestBody HelloWordReq req);

    @PostMapping(value = "/hello-word/user")
    public User user(@RequestBody User req);
}
