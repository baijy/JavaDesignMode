package com.jianyu.dp.template;

/**
 * 模板模式测试方法
 * 参考：http://ifeve.com/template-method-design-pattern/
 * @author BaiJianyu
 *
 */
public class HouseClient {
	public static void main(String[] args) {
		HouseTemplate glass = new GlassHouse();
		HouseTemplate wood = new WoodenHouse();
		
		glass.buildHouse();
		System.out.println("---------------");
		wood.buildHouse();
	}
}
