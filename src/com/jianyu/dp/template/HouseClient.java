package com.jianyu.dp.template;

/**
 * ģ��ģʽ���Է���
 * �ο���http://ifeve.com/template-method-design-pattern/
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
