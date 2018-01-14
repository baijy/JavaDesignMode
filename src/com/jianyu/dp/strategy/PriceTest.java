package com.jianyu.dp.strategy;

/**
 * 策略模式
 * 参考：https://www.cnblogs.com/java-my-life/archive/2012/05/10/2491891.html
 * @author BaiJianyu
 *
 */
public class PriceTest {
	public static void main(String[] args) {
		IMemberStrategy strategy = new InterMediateMemberStrategy(); // 中级会员策略
		Price price = new Price(strategy);

		double num = price.quote(100);
		System.out.println("中级会员最终价格为：" + num);

		IMemberStrategy adStrategy = new AdvancedMemberStratege(); // 高级会员策略
		Price AdPrice = new Price(adStrategy);
		double adNUm = AdPrice.quote(100);
		System.out.println("高级会员最终价格为：" + adNUm);
	}
}
