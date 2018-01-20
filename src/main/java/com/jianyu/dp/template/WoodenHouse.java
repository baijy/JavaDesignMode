package com.jianyu.dp.template;

public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildPillars() {
		System.out.println("建木头房，打柱子咯！用木头打柱子");

	}

	@Override
	public void buildWalls() {
		System.out.println("建木头房，砌墙咯！用木头做墙壁");

	}
	
	@Override
	public void buildWindows(){
		System.out.println("木头房子，窗户不用玻璃！");
	}
}
