package com.jianyu.dp.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * CGLIB动态代理
 * 
 * @author jianyu.bai
 *
 */
public class CglibProxy implements MethodInterceptor {
	private Object targetObject;
	
	 // 这里的目标类型为Object，则可以接受任意一种参数作为被代理类，实现了动态代理
	public Object getInstance(Object target) {
		this.targetObject = target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass()); // 增强的父类是被代理类
		enhancer.setCallback(this); // 回调类就是本类
		// 注意该处代理的创建过程
		Object proxyObj = enhancer.create();
		return proxyObj;
	}
	
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		Object obj = null;
		System.out.println("--before, cglib proxy do some thing ...");
		obj = method.invoke(targetObject, args);
		System.out.println("--after, cglib proxy do some thing ...");
		return obj;
	}

}
