package com.jianyu.dp.strategy;

/**
 * 会员策略接口
 * @author BaiJianyu
 *
 */
public interface IMemberStrategy {
	public double calcPrice(double bookPrice);
}
