package com.jianyu.dp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import java.lang.reflect.Method;

/**
 * 动态代理
 * @author jianyu.bai
 *
 */
public class JdkProxy implements InvocationHandler {
	private Object person;

	// 这里的目标类型为Object，则可以接受任意一种参数作为被代理类，实现了动态代理。但是要注意下面的newProxyInstance（）中的参数
	public Object getInstance(Object person) {
		this.person = person;
		// 三个参数：类加载器，接口，Handler
		return Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("--before, jdk proxy do some thing ...");
		method.invoke(person, args);
		System.out.println("--after, jdk proxy do some thing ...");
		return null;
	}

}
