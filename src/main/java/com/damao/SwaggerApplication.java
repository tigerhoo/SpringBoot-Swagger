package com.damao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author huyongxing
 * @email huyongxing@qihaiyun.com
 * @date 2018/7/3 15:36
 */
@EnableSwagger2
@SpringBootApplication
public class SwaggerApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SwaggerApplication.class, args);
    }
}
