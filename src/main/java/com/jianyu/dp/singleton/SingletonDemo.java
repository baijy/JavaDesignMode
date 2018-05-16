package com.jianyu.dp.singleton;

/**
 * 双重校验的单例模式
 * 1、静态对象
 * 2、私有构造函数
 * 3、get方法，对类枷锁
 * 
 * 参考：https://www.cnblogs.com/cielosun/p/6582333.html
 * 
 * @author BaiJianyu <br>
 * @date 2018年5月15日下午2:50:21 <br>
 * Better late than never. <br>
 */
public class SingletonDemo {
	private volatile static SingletonDemo instance;
	private SingletonDemo(){
		System.out.println("Singleton has loaded");
	}
	
	public static SingletonDemo getInstance(){
		if(null == instance){
			synchronized (SingletonDemo.class) {
				if(null == instance){
					instance = new SingletonDemo();
				}
			}
		}
		
		return instance;
	}
	

}
