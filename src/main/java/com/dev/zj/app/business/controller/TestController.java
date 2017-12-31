package com.dev.zj.app.business.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author P50
 * @date 2017/12/30 22:09
 */
@RestController
public class TestController {

    @GetMapping("/test")
    private Object test() {
        Map<String ,Object> map = new HashMap<>(16);
        map.put("热部署","这是热部署1");
        map.put("热加载","这是热加载1");
        return map;
    }
}
