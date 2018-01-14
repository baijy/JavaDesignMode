package com.jianyu.dp.prototype;

import java.util.ArrayList;

/**
 * �����࣬���а��������������
 * 
 * @author BaiJianyu
 * 
 */
public class Resume implements Cloneable {
	private String name;
	private int age;
	private String sex;
	public ArrayList<String> familyMembers = new ArrayList<String>(); // ��ͥ��Ա
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

	// Ϊ���Ӷ���ֵ
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

	// ǳ���������ƶ���ʱ���������������
	public void setWorkExp(String timeArea, String company) {
		this.workExp.timeArea = timeArea;
		this.workExp.company = company;
	}

	// ������дclone����
	@Override
	public Resume clone() throws CloneNotSupportedException {
		return (Resume) super.clone();
	}

	//�����Ϊÿ���ֶζ������µĶ���
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

	// ��ӡ����
	public void display() {
		System.out.println("������" + this.name + ",�Ա�" + this.sex + ",���䣺"
				+ this.age);
		System.out.println("��ͥ��Ա��:");
		for (String mem : familyMembers) {
			System.out.println("  " + mem);
		}
		System.out.println(this.workExp.timeArea + "������" + this.workExp.company
				+ "������");
	}
}
