package servlet;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

/**
 * Created by Administrator on 2017/3/30.
 */
@ServerEndpoint("/testWebsocket")
public class MyWebSocketServlet {
    @OnOpen
    public void start(){
        System.out.println("start");
    }

    @OnClose
    public void end(){
        System.out.println("end");
    }

    @OnMessage
    public void incoming(String message){
        System.out.println(message);
    }
}
