package com.jianyu.dp.proxy;

/**
 * 动态代理测试类
 * 
 * @author jianyu.bai
 *
 */
public class JdkProxyTest {
	public static void main(String[] args) {
		Person person = (Person) new JdkProxy().getInstance(new XiaoMing());
		// 注意这里的person不是目标类person，而是代理类person
		// debug的时候显示null，有'$'标识符
		System.out.println("clase name: " + person.getClass().getName());
		person.doWork();
	}
}
