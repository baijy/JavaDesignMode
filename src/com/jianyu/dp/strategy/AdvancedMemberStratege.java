package com.jianyu.dp.strategy;

/**
 * 高级会员优惠策略
 * 
 * @author BaiJianyu
 * 
 */
public class AdvancedMemberStratege implements IMemberStrategy {

	@Override
	public double calcPrice(double bookPrice) {
		return bookPrice * 0.8;
	}

}
