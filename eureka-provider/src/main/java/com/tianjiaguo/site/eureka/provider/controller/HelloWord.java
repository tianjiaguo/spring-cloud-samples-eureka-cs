package com.tianjiaguo.site.eureka.provider.controller;


import com.tianjiaguo.site.eureka.model.HelloWordReq;
import com.tianjiaguo.site.eureka.model.HelloWordRsp;
import com.tianjiaguo.site.eureka.model.Result;
import com.tianjiaguo.site.eureka.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO:
 *
 * @author tianjiaguo
 * @version 2018/9/8 下午4:22
 */
@RestController
@RequestMapping("/hello-word")
//@FeignClient("hello-service")
public class HelloWord {
    @PostMapping(value = "create")
    public Result<HelloWordRsp> helloWord(@RequestBody HelloWordReq req) {
        HelloWordRsp rsp = new HelloWordRsp();
        rsp.setValue("Hello Word!" + req.getName());
        return new Result<HelloWordRsp>(200, "ok", "ok", rsp);
    }

    @PostMapping(value = "user")
    public User user(@RequestBody User req) {
        return User.newBuilder()
                .setUsername(req.getUsername() + ":=>2")
                .setPassword(req.getPassword() + ":=>2")
                .build();
    }
}
