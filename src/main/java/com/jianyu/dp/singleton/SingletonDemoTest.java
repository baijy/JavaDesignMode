package com.jianyu.dp.singleton;

public class SingletonDemoTest {
	public static void main(String[] args) {
				
		for (int i = 0; i < 100 ; i++) {
			SingletonDemo instance = SingletonDemo.getInstance();
			System.out.println(instance);
		}
	}
}
