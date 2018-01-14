package com.jianyu.dp.strategy;

/**
 * �۸���
 * @author BaiJianyu
 *
 */
public class Price {
	// ���в��Զ���
	private IMemberStrategy strategy;
	
	// ���캯������������
	public Price(IMemberStrategy strategy){
		this.strategy = strategy;
	}
	
	/**
	 * ���ò��Է����������ۿۺ�ļ۸�
	 * @param price
	 * @return
	 */
	public double quote(double price ){
		return this.strategy.calcPrice(price);
	}

}
