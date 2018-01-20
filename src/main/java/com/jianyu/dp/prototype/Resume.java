package com.jianyu.dp.prototype;

import java.util.ArrayList;

/**
 * 简历类，其中包含工作经验对象
 * 
 * @author BaiJianyu
 * 
 */
public class Resume implements Cloneable {
	private String name;
	private int age;
	private String sex;
	public ArrayList<String> familyMembers = new ArrayList<String>(); // 家庭成员
	private WorkExperience workExp = new WorkExperience();

	public Resume(String name, ArrayList<String> familyMembers) {
		this.name = name;
		this.familyMembers = familyMembers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	// 为复杂对象赋值
	public void setPersonal(String sex, int age) {
		this.age = age;
		this.sex = sex;
	}

	public ArrayList<String> getFamilyMembers() {
		return familyMembers;
	}

	public void setFamilyMembers(ArrayList<String> familyMembers) {
		this.familyMembers = familyMembers;
	}

	public WorkExperience getWorkExp() {
		return workExp;
	}

	// 浅拷贝：复制对象时，逐个复制其属性
	public void setWorkExp(String timeArea, String company) {
		this.workExp.timeArea = timeArea;
		this.workExp.company = company;
	}

	// 必须重写clone方法
	@Override
	public Resume clone() throws CloneNotSupportedException {
		return (Resume) super.clone();
	}

	//深拷贝，为每个字段都创建新的对象
	public Resume deepClone() {
		int age = this.age;
		String sex = this.sex;
		String name = new String(this.name);
		ArrayList<String> famMem = new ArrayList<String>(this.familyMembers);

		Resume copy = new Resume(name, famMem);
		copy.setPersonal(sex, age);
		copy.setWorkExp(this.workExp.timeArea, this.workExp.company);
		return copy;
	}

	// 打印方法
	public void display() {
		System.out.println("姓名：" + this.name + ",性别：" + this.sex + ",年龄："
				+ this.age);
		System.out.println("家庭成员有:");
		for (String mem : familyMembers) {
			System.out.println("  " + mem);
		}
		System.out.println(this.workExp.timeArea + "曾经在" + this.workExp.company
				+ "工作过");
	}
}
