package com.jianyu.dp.prototype;

import java.util.ArrayList;

/**
 * 
 * @author BaiJianyu
 * 
 *         实际测试过程中，如果复杂对象自己有set方法，直接set不会出现修改原对象值的情况
 * 
 */
public class ShallowCopyTest {
	public static void main(String[] args) throws CloneNotSupportedException {

		ArrayList<String> familyMembers = new ArrayList<String>();
		familyMembers.add("tom爸爸");
		familyMembers.add("tom妈妈");
		familyMembers.add("tom哥哥");
		Resume tom = new Resume("tom", familyMembers);
		tom.setPersonal("男", 18);
		tom.setWorkExp("2012-2020", "<1>腾讯");
		// tom.display();

		// System.out.println("-----------");

		//如果是new出来一个对象，再赋值，当然不会改变原对象的属性。
		//Resume pony = tom.clone();
		Resume pony = tom.deepClone();
		pony.setName("pony");
		pony.familyMembers.add("pony妹妹");
		pony.setWorkExp("2014-2030", "<2>平安银行");
		//pony.display();

		System.out.println("\n------克隆以后的tom对象-----\n");
		tom.display();

	}
}
