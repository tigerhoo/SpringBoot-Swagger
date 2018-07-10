//package com.damao.websocket;
//
//import org.springframework.web.socket.client.WebSocketConnectionManager;
//import org.springframework.web.socket.client.standard.StandardWebSocketClient;
//import org.springframework.web.socket.handler.TextWebSocketHandler;
//
///**
// * @author huyongxing
// * @email huyongxing@qihaiyun.com
// * @date 2018/7/4 17:22
// */
//public class WebSocketClient extends StandardWebSocketClient {
//    static WebSocketConnectionManager webSocketConnectionManager;
//
//
//    public static void main(String[] args) {
//        String url = "ws://127.0.0.1:1352";
//        String data = "{\"requestID\":\"12345678901234567890\",\"verson\":\"1.0\",\"cmd\":\"getPrinters\"}";
//        StandardWebSocketClient socketClient = new StandardWebSocketClient();
//        TextWebSocketHandler webSocketHandler = new TextWebSocketHandler();
//        webSocketConnectionManager = new WebSocketConnectionManager(socketClient,
//                webSocketHandler, url, data);
//        webSocketConnectionManager.start();
//    }
//}
