package com.damao.websocket;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author huyongxing
 * @site www.skson.com
 * @date 2018/7/4 17:22
 */
public class WebSocketClientTB extends WebSocketClient {
    static WebSocketClientTB webSocket = null;

    public static void main(String[] args) throws URISyntaxException {
        String uri = "ws://127.0.0.1:13528";
        webSocket = new WebSocketClientTB(new URI(uri), new Draft_6455());
        //建立连接
        webSocket.connect();

    }

    public WebSocketClientTB(URI serverUri, Draft draft) {
        super(serverUri, draft);
    }

    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        //获取打印机列表
        String getPrinterListCmd = "{\"requestID\":\"8410ACC8\",\"verson\":\"1.0\",\"cmd\":\"getPrinters\"}";
        webSocket.send(getPrinterListCmd);
        //获取打印机配置
        String getPrinterConfigCmd = "{\"cmd\":\"getPrinterConfig\",\"printer\":\"Foxit Reader PDF Printer\",\"version\":\"1.0\",\"requestID\":\"8410ACC8\"}";
        webSocket.send(getPrinterConfigCmd);
        //发送打印任务
        String printCmd = "{\"cmd\":\"print\",\"requetID\":\"B6BBF90A\",\"version\":\"1.0\",\"task\":{\"taskID\":\"1530697907531\",\"preview\":false,\"notifyMode\":\"oneByOne\",\"printer\":\"Foxit Reader PDF Printer\",\"firstDocumentNumber\":1,\"totalDocumentCount\":1,\"documents\":[{\"documentID\":\"GO0F8070306161829\",\"contents\":[null,{\"templateURL\":\"http://www.1dadan.com/caiNiaoPrint/template/15/27517\",\"data\":{\"logisticsCompanyType\":\"03\",\"templateType\":\"1\",\"buyerNick\":\"tiger\",\"shopName\":\"\",\"goods\":[{\"index\":0,\"id\":15002457060,\"logisticsOrderNo\":\"GO0F8070306161829\",\"goodsName\":\"light充电线\",\"quantity\":\"1\",\"goodsProps\":\"根\",\"goodsNo\":\"OX-1023\",\"identCode\":null,\"isNewLine\":\"\\n\",\"goodsPrice\":\"56.00\",\"picPath\":null,\"goodsDiscountAmount\":null,\"articleNo\":\"52x\",\"netReceiptsAmount\":null,\"goodsIndex\":0},{\"index\":0,\"id\":15002459042,\"logisticsOrderNo\":\"GO0F8070306161829\",\"goodsName\":\"苹果X\",\"quantity\":\"1\",\"goodsProps\":\"银色\",\"goodsNo\":\"0110-sd\",\"identCode\":null,\"isNewLine\":\"\\n\",\"goodsPrice\":\"8860.00\",\"picPath\":null,\"goodsDiscountAmount\":null,\"articleNo\":\"051\",\"netReceiptsAmount\":null,\"goodsIndex\":0}],\"receiverProvince\":\"广东省\",\"receiverCounty\":\"宝安区\",\"receiverCity\":\"深圳市\",\"receiverFullAddress\":\"广东省深圳市宝安区西乡街道沃尔玛\",\"shipperMobile\":\"13168040756\",\"orderAmount\":\"8916.00\",\"receiverPhone\":\"\",\"cloudPrintData\":null,\"sellerMessage\":\"\",\"goodsNum\":\"2\",\"orderNo\":\"GO0F8070306161829\",\"tradeNo\":\"GO0F8070306161829\",\"receiverName\":\"tiger\",\"printDate\":\"2018-07-04\",\"receiverMobile\":\"16675356595\",\"shipperName\":\"库克\",\"isPrintAddFlag\":false,\"buyerMessage\":\"\",\"shipperPhone\":\"\",\"printNo\":\"11\",\"logisticsNo\":\"\",\"shipperFullAddress\":\"上海上海市杨浦区苹果仓库\",\"pageIndex\":1}}]}]}}";
//        webSocket.send(printCmd);
    }

    //WebSocket回调函数
    @Override
    public void onMessage(String message) {
        //TODO 对打印服务返回的数据进行处理
        System.out.println(message);
    }

    @Override
    public void onClose(int i, String s, boolean b) {

    }

    @Override
    public void onError(Exception e) {

    }
}
