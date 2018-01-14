package com.jianyu.dp.strategy;

/**
 * 中级会员优惠策略
 * @author BaiJianyu
 *
 */
public class InterMediateMemberStrategy implements IMemberStrategy {

	@Override
	public double calcPrice(double bookPrice) {
		return bookPrice * 0.9;
	}

}
