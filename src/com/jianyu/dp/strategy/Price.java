package com.jianyu.dp.strategy;

/**
 * 价格类
 * @author BaiJianyu
 *
 */
public class Price {
	// 持有策略对象
	private IMemberStrategy strategy;
	
	// 构造函数传入具体策略
	public Price(IMemberStrategy strategy){
		this.strategy = strategy;
	}
	
	/**
	 * 调用策略方法，计算折扣后的价格
	 * @param price
	 * @return
	 */
	public double quote(double price ){
		return this.strategy.calcPrice(price);
	}

}
