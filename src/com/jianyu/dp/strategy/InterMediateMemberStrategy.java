package com.jianyu.dp.strategy;

/**
 * �м���Ա�Żݲ���
 * @author BaiJianyu
 *
 */
public class InterMediateMemberStrategy implements IMemberStrategy {

	@Override
	public double calcPrice(double bookPrice) {
		return bookPrice * 0.9;
	}

}
