package com.jianyu.dp.strategy;

/**
 * ����ģʽ
 * �ο���https://www.cnblogs.com/java-my-life/archive/2012/05/10/2491891.html
 * @author BaiJianyu
 *
 */
public class PriceTest {
	public static void main(String[] args) {
		IMemberStrategy strategy = new InterMediateMemberStrategy(); // �м���Ա����
		Price price = new Price(strategy);

		double num = price.quote(100);
		System.out.println("�м���Ա���ռ۸�Ϊ��" + num);

		IMemberStrategy adStrategy = new AdvancedMemberStratege(); // �߼���Ա����
		Price AdPrice = new Price(adStrategy);
		double adNUm = AdPrice.quote(100);
		System.out.println("�߼���Ա���ռ۸�Ϊ��" + adNUm);
	}
}
