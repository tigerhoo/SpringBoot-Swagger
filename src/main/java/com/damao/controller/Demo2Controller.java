package com.damao.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huyongxing
 * @email huyongxing@qihaiyun.com
 * @date 2018/7/3 16:10
 */
@Api(tags = "demo家族")
@RestController
@RequestMapping("/api")
public class Demo2Controller {

    @ApiOperation(value = "获取列表",notes = "这个是什么东西",response = Map.class,httpMethod = "GET",code = 200)
    @ApiImplicitParam(name = "name",value = "请求参数name",type = "string")
    @GetMapping(value = "/list", name = "测试list")
    public Object xx(@RequestParam String name) {
        return new HashMap<String, Object>(16) {{
            put("code", "0001");
            put("msg", "这你野心？");
        }};
    }
}
