package com.jianyu.dp.template;

public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildPillars() {
		System.out.println("��ľͷ���������ӿ�����ľͷ������");

	}

	@Override
	public void buildWalls() {
		System.out.println("��ľͷ������ǽ������ľͷ��ǽ��");

	}
	
	@Override
	public void buildWindows(){
		System.out.println("ľͷ���ӣ��������ò�����");
	}
}
