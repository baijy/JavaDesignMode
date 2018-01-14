package com.jianyu.dp.template;

/**
 * 建造房子的模板，抽象类
 * @author BaiJianyu
 *
 */
public abstract class HouseTemplate {
	// 模板方法，子类不可以重写
	public final void buildHouse(){
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("建房的工序已经完成！");
	}
	
	// 打地基
	public void buildFoundation(){
		System.out.println("开始打地基了！");
	};
	
	//在子类中必须实现的方法
	// 打柱子
	public abstract void buildPillars();
	// 砌墙
	public abstract void buildWalls();
	
	// 砌窗户，有默认实现，可以被重写
	public void buildWindows(){
		System.out.println("使用玻璃窗户");
	}
	
	
}
