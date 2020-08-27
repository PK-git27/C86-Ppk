package com.yc.C86S3PpkSpringBoot.biz;

import java.io.IOException;
import java.util.Hashtable;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@ServerEndpoint(value = "/websocket/{id}")
@Component
public class MyWebSocket {

	public static Hashtable<String, Session> webSocketMap = new Hashtable<>();
	
	//连接建立成功调用的方法
	@OnOpen
	public void onOpen(@PathParam("id")String id, Session session) {
		
		System.out.println(id+"已经连接成功");
		webSocketMap.put(id, session);
		
	}
	//连接关闭调用方法
	@OnClose
	public void OnClose(Session session) {
		
		System.out.println("会话已经关闭");
		
	}
	
	//收到客户端消息后调用的方法
	@OnMessage
	public void onMessage(String message,Session session) throws IOException {
		
		String[] ss = message.split(":");
		String id = ss[0];
		String msg = ss[1];
		Session targetSession = webSocketMap.get(id);
		if(targetSession != null) {
			targetSession.getBasicRemote().sendText(msg);
		}else {
			System.out.println(id + "不在线");
		}
	}
	
	//每10秒
	@Scheduled(cron = "*/10 * * * * ?")
	public void luckYou() throws IOException{
		for(Session session : webSocketMap.values()) {
			session.getBasicRemote().sendText("祝你好运");
		}
	}

	
	
}
