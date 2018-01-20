package com.jianyu.dp.proxy;

public class ProxyTest {
	public static void main(String[] args) {
		XiaoMing xiaoming = new XiaoMing();
		Proxy proxy = new Proxy(xiaoming);
		System.out.println("class name: "+proxy.getClass().getName());
		proxy.doWork();
	}
}
