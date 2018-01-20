package com.jianyu.dp.proxy;
/**
 * 
 * @author jianyu.bai
 * 参考链接：http://www.jb51.net/article/110345.htm
 */
class PackageInfo {
	/**
	 * 总结：代理的三种：JDK静态代理、JDK动态代理、CGLIB动态代理
	 * 1、静态代理：实现接口，持有被代理对象的引用，在构造函数中传入实现类
	 * 2、JDK动态代理：实现InvocationHandler，创建getInstance()，通过invoke()调用代理的方法
	 * 3、CGLIB动态代理：实现MethodInterceptor，创建getInstance()，通过invoke()调用代理的方法
	 * 
	 */
}