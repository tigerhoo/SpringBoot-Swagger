package com.damao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.sockjs.SockJsService;

/**
 * @author huyongxing
 * @email huyongxing@qihaiyun.com
 * @date 2018/7/3 15:36
 */
@EnableWebSocket
@SpringBootApplication
public class SwaggerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SwaggerApplication.class, args);
    }
}
