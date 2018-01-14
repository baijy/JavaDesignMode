package com.jianyu.dp.template;

/**
 * 建玻璃房
 * @author BaiJianyu
 *
 */
public class GlassHouse extends HouseTemplate {

	@Override
	public void buildPillars() {
		System.out.println("建玻璃房，打柱子咯！用钢铁做柱子");

	}

	@Override
	public void buildWalls() {
		System.out.println("建玻璃房，砌墙咯！用玻璃做墙壁");

	}

}
