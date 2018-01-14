package com.jianyu.dp.prototype;

import java.util.ArrayList;

/**
 * 
 * @author BaiJianyu
 * 
 *         ʵ�ʲ��Թ����У�������Ӷ����Լ���set������ֱ��set��������޸�ԭ����ֵ�����
 * 
 */
public class ShallowCopyTest {
	public static void main(String[] args) throws CloneNotSupportedException {

		ArrayList<String> familyMembers = new ArrayList<String>();
		familyMembers.add("tom�ְ�");
		familyMembers.add("tom����");
		familyMembers.add("tom���");
		Resume tom = new Resume("tom", familyMembers);
		tom.setPersonal("��", 18);
		tom.setWorkExp("2012-2020", "<1>��Ѷ");
		// tom.display();

		// System.out.println("-----------");

		//�����new����һ�������ٸ�ֵ����Ȼ����ı�ԭ��������ԡ�
		//Resume pony = tom.clone();
		Resume pony = tom.deepClone();
		pony.setName("pony");
		pony.familyMembers.add("pony����");
		pony.setWorkExp("2014-2030", "<2>ƽ������");
		//pony.display();

		System.out.println("\n------��¡�Ժ��tom����-----\n");
		tom.display();

	}
}
