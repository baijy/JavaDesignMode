package com.jianyu.dp.strategy;

/**
 * �߼���Ա�Żݲ���
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
