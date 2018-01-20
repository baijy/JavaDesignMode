package com.jianyu.dp.proxy;

/**
 * CGLIB动态代理
 * 
 * @author jianyu.bai
 *
 */
public class CglibProxyTest {
	public static void main(String[] args) {
		Person person = (Person) new CglibProxy().getInstance(new XiaoMing());
		//
		System.out.println("class name: "+person.getClass().getName());
		person.doWork();
	}
}
