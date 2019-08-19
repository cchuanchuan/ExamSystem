package top.cllccc.exam.websocket;

import org.springframework.stereotype.Component;
import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/webSocketServer")
@Component
public class WebSocketDemo {

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("新开启了一个webSocket连接" + session.getId());
    }

    @OnMessage
    public String onMessage(String message, Session session) {
        System.out.println("收到客户端发送的信息:"+message);
        System.out.println("当前的sessionId:"+session.getId());
        return "SUCCESS";
    }

    @OnClose
    public void onClose(Session session, CloseReason reason) {
        System.out.println("webSocket连接关闭：sessionId:"+session.getId() + "关闭原因是："+reason.getReasonPhrase() + ",code:"+reason.getCloseCode());
    }

    @OnError
    public void onError(Throwable t) {
        t.printStackTrace();

    }



}
