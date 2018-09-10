package com.tianjiaguo.site.eureka.consumer.controller;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.tianjiaguo.site.eureka.consumer.service.HelloWord;
import com.tianjiaguo.site.eureka.model.HelloWordReq;
import com.tianjiaguo.site.eureka.model.HelloWordRsp;
import com.tianjiaguo.site.eureka.model.Result;
import com.tianjiaguo.site.eureka.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * TODO:
 *
 * @author tianjiaguo
 * @version 2018/9/8 下午10:52
 */
@RestController
@RequestMapping("/hello-word")
public class ConsumeController {
    @Resource
    private HelloWord helloWord;

    @GetMapping(value = "select")
    public String query() {
        HelloWordReq req = new HelloWordReq();
        req.setName("guoguo");
        Result<HelloWordRsp> result = helloWord.helloWord(req);
        System.out.println(result);
        User user = helloWord.user(
                User.newBuilder().setUsername("guoguo").setPassword("123").build()
        );
        System.out.println(user);
        Map<String, Object> map = Maps.newHashMap();
        map.put("a", result);
        map.put("b", user);
        return new Gson().toJson(map);
    }
}
