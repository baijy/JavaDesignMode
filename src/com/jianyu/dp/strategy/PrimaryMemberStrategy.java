package com.jianyu.dp.strategy;

/**
 * 初级会员优惠策略
 * @author BaiJianyu
 *
 */
public class PrimaryMemberStrategy implements IMemberStrategy {

	@Override
	public double calcPrice(double bookPrice) {
		return bookPrice * 0.95;
	}

}
