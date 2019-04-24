package com.damao.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @author huyongxing
 * @site www.skson.com
 * @date 2018/7/3 16:10
 */
@Api(tags = "demo家族")
@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping(value = "/{id}", name = "测试get")
    public Object xx(@PathVariable String id, @RequestParam String name) {
        return new HashMap<String, Object>(16) {{
            put("code", "0001");
            put("msg", "这你野心？");
        }};
    }
}
