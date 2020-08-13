package com.yc.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.apache.ibatis.annotations.Insert;

import com.yc.spring.dao.UserDao;

/**
 * MyBaits 的会话对象
 * @author pk
 *
 */
public class SqlSession {
	
	public static void main(String[] args) {
		SqlSession session = new SqlSession();
		
		UserDao udao = session.getMapper(UserDao.class);
		
		udao.insert(null);
	}

	/**
	 * 泛型方法：你输入的什么类型，返回的就是什么类型对象
	 * 根据输入的接口，返回接口代理对象
	 * 
	 * MyBaits 动态代理 没有目标兑现 session.gerMapper(UserMapper.class)
	 * @param cls
	 * @return
	 */
	public <M> M getMapper(Class<M> cls) {
		
		@SuppressWarnings("unchecked")
		M ret = (M) Proxy.newProxyInstance(
				cls.getClassLoader(), 
				new Class[] {cls}, 
				new InvocationHandler() {
			
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				
				Insert insert = method.getAnnotation(Insert.class);
				if(insert != null) {
					System.out.println("执行: " + insert.value()[0]);
					method.getReturnType().equals(Insert.class);
				}
				return 0;
			}
		});
		
		
		return ret;
	}
}
