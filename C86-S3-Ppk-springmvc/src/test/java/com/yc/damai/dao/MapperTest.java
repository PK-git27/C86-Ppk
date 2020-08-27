package com.yc.damai.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@ContextConfiguration("/beans.xml")
public class MapperTest {
	@Resource
	DmProductMapper mapper;
	
	@Test
	public void test16() throws IOException {
		//DmProductMapper mapper = session.getMapper(DmProductMapper.class);
		mapper.selectById(1);
		
	}
	
//	//动态块
//	{
//		try {
//			//mybatis 配置文件
//			String resource = "mybatis.xml";
//			//读入配置文件
//			InputStream inputStream;
//			inputStream = Resources.getResourceAsStream(resource);
//			//构建会话工厂 ==> 23设计模式 工厂模式
//			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//			//开启会话
//			session = sqlSessionFactory.openSession();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	
//	//测试方法必须加Test注解
//	@Test
//	public void test1() throws IOException {
//		//session.selectList("xml接口的命名空间+英文点号+查询的sql的id")
//		List<DmProduct> list = session.selectList("com.yc.damai.dao.DmProductMapper.selectAll");
//		
//		/**
//		 * 使用断言进行结果的判断
//		 */
//		Assert.assertEquals(true, list.size()>0);
//		
//		 for(DmProduct dp : list) { System.out.println(dp); }
//		
//	}
//	
//	@Test
//	public void test2() throws IOException {
//		DmCategory dc = new DmCategory();
//		dc.setCname("测试分类");
//		dc.setPid(1);
//		
//		//获取映射接口实现类(核心技术) 动态代理(JDK)
//		DmCategoryMapper mapper = session.getMapper(DmCategoryMapper.class);
//		mapper.insert(dc);
//		//session.insert("com.yc.damai.dao.DmProductMapper.insert",dc);
//		//不commit,会话会在关闭自动回滚
//		session.commit();
//	}
//	
//	@Test
//	public void test3() throws IOException {
//		DmCategory dc = new DmCategory();
//		dc.setId(48);
//		dc.setCname("修改后的测试分类");
//		dc.setPid(1);
//		//获取映射接口实现类(核心技术) 动态代理(JDK)
//		DmCategoryMapper mapper = session.getMapper(DmCategoryMapper.class);
//		mapper.update(dc);
//		//session.insert("com.yc.damai.dao.DmProductMapper.update",dc);
//		//不commit,会话会在关闭自动回滚
//		session.commit();
//	}
//	
//	@Test
//	public void test4() throws IOException {
////		DmCategory dc = new DmCategory();
////		dc.setId(44);
////		dc.setCname("修改后的测试分类");
////		dc.setPid(1);
//		//获取映射接口实现类(核心技术) 动态代理(JDK)
//		DmCategoryMapper mapper = session.getMapper(DmCategoryMapper.class);
//		mapper.delete(45);
//		//session.insert("com.yc.damai.dao.DmProductMapper.delete",dc);
//		//不commit,会话会在关闭自动回滚
//		session.commit();
//	}
//	
//	@Test
//	public void test5() throws IOException {
//		DmProduct dp = new DmProduct();
//		dp.setCid(2);
//		dp.setPname("测试产品");
//		dp.setIsHot(1);
//		session.insert("com.yc.damai.dao.DmProductMapper.insert1",dp);
//		//不commit,会话会在关闭自动回滚
//		session.commit();
//	}
//	
//	@Test
//	public void test6() throws IOException {
//		DmProduct dp = new DmProduct();
//		dp.setId(73);
//		dp.setPname("修改后测试产品");
//		dp.setIsHot(0);
//		session.insert("com.yc.damai.dao.DmProductMapper.update1",dp);
//		//不commit,会话会在关闭自动回滚
//		session.commit();
//	}
//	
//	@Test
//	public void test7() throws IOException {
//		DmProduct dp = new DmProduct();
//		dp.setId(73);
//		dp.setPname("修改后测试产品");
//		dp.setIsHot(0);
//		session.insert("com.yc.damai.dao.DmProductMapper.delete1",dp);
//		//不commit,会话会在关闭自动回滚
//		session.commit();
//	}
//	
//	@Test
//	public void test8() throws IOException {
//		/**
//		 * 1.先查出一个订单明细记录
//		 * 2.查出该订单明细对应的商品信息
//		 */
//		/*
//		 * DmOrderitemMapper dom = session.getMapper(DmOrderitemMapper.class);
//		 * DmProductMapper dpm = session.getMapper(DmProductMapper.class); DmOrderitem
//		 * doi = dom.selectById(59); DmProduct dp = dpm.selectById(doi.getPid());
//		 * System.out.println(dp);
//		 */
//		
//		/**
//		 * 测试驱动开发 ==> 先写好所有的测试代码 ==>再业务代码
//		 */
//		DmOrderitemMapper dom = session.getMapper(DmOrderitemMapper.class);
//		DmOrderitem doi = dom.selectById(59);
//		//java黑科技 ==> 反射 ==> 动态代理技术
//		DmProduct dp = doi.getDmProduct(); //调用DmOrderitem 表的getDmProduct属性
//		
//		System.out.println(dp);
//		
//		
//		//不commit,会话会在关闭自动回滚
//		session.commit();
//	}
//	
//	@Test
//	public void test9() throws IOException {
// 		/**
//		 * 测试驱动开发 ==> 先写好所有的测试代码 ==>再业务代码
//		 */
//		DmOrdersMapper mapper = session.getMapper(DmOrdersMapper.class);
//		List<DmOrders> dosList = mapper.selectAll();
//		DmOrders dos = dosList.get(2);
//		List<DmOrderitem> doiList = dos.getDoi();
//		//java黑科技 ==> 反射 ==> 动态代理技术
//	//	DmProduct dp = doi.getDmProduct(); //调用DmOrderitem 表的getDmProduct属性
//		
//	//	System.out.println(doi);
//		
//		
//		//不commit,会话会在关闭自动回滚
//		session.commit();
//	}
//	
//	@Test
//	public void test10() throws IOException {
//		DmCategoryMapper mapper = session.getMapper(DmCategoryMapper.class);
//		List<DmCategory> dcList = mapper.selectAll();
//		DmCategory dc = dcList.get(1);
//		Assert.assertEquals("鞋靴箱包", dc.getCname());
//		
//		Assert.assertEquals(6, dc.getChildren().size());
//		//不commit,会话会在关闭自动回滚
//	}
//	
//	@Test
//	public void test11() throws IOException {
//		DmProductMapper mapper = session.getMapper(DmProductMapper.class);
//		mapper.selectByObj(null);
//		DmProduct dp = new DmProduct();
//		dp.setPname("测试描述");
//		dp.setIsHot(1);
//		mapper.selectByObj(dp);
//		System.out.println("============================");
//		dp.setPname("最后一次测试");
//		dp.setIsHot(-1);
//		mapper.selectByObj(dp);
//		System.out.println("============================");
//		dp.setIsHot(-2);
//		mapper.selectByObj(dp);
//		System.out.println("============================");
//		dp.setIsHot(0);
//		mapper.selectByObj(dp);
//		System.out.println("============================");
//	}
//	
//	@Test
//	public void test12() throws IOException {
//		DmProductMapper mapper = session.getMapper(DmProductMapper.class);
//		int [] cids = {1,2,3};
//		mapper.selectByCids(cids);
//	}
//	
//	@Test
//	public void test13() throws IOException {
//		DmProductMapper mapper = session.getMapper(DmProductMapper.class);
//		DmProduct dp = new DmProduct();
//		dp.setId(1);
//		dp.setMarketPrice(885d);
//		mapper.update(dp);
//		DmProduct dbdp = mapper.selectById(1);
//		
//		Assert.assertEquals((Double)885d, dbdp.getMarketPrice());
//		Assert.assertEquals((Double)228d, dbdp.getShopPrice());
//		
//		
//	}
//	
//	
//	@Test
//	public void test14() throws IOException {
//		DmOrdersMapper dosm = session.getMapper(DmOrdersMapper.class);
//		DmOrderitemMapper doim = session.getMapper(DmOrderitemMapper.class);
//		
//		//生成订单业务
//		DmOrderitem doi1 = new DmOrderitem();
//		doi1.setPid(1);
//		doi1.setCount(1);
//		doi1.setTotal(100d);
//		DmOrderitem doi2 = new DmOrderitem();
//		doi2.setPid(2);
//		doi2.setCount(1);
//		doi2.setTotal(200d);
//		DmOrders dos = new DmOrders();
//		dos.setTotal(300d);
//		dos.setAid(1);
//		dos.setState(1);
//		dos.setUid(1);
//		
//		try {
//			//写订单 表
//			dosm.insert(dos);
//			//写订单明细表
//			doi1.setOid(dos.getId());
//			doi2.setOid(dos.getId());
//			
//			doim.insert(doi1);
//			doim.insert(doi2);
//			session.commit();
//		}catch(Exception e) {
//			e.printStackTrace();
//			session.rollback();
//		}finally {
//			session.close();
//		}
//		
//		
//	}
//	
//	@Test
//	public void test15() throws IOException {
//		DmProductMapper mapper = session.getMapper(DmProductMapper.class);
//		DmProductMapper mapper2 = session.getMapper(DmProductMapper.class);
//		int[] cids = {1000};
//		mapper.selectByCids(cids);
//		
//		session.commit();
//		
//		mapper2.selectByCids(cids);
//		mapper2.selectByCids(cids);
//		
//	}
	
	
	

}
