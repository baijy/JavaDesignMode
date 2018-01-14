package com.jianyu.dp.template;

/**
 * ���췿�ӵ�ģ�壬������
 * @author BaiJianyu
 *
 */
public abstract class HouseTemplate {
	// ģ�巽�������಻������д
	public final void buildHouse(){
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("�����Ĺ����Ѿ���ɣ�");
	}
	
	// ��ػ�
	public void buildFoundation(){
		System.out.println("��ʼ��ػ��ˣ�");
	};
	
	//�������б���ʵ�ֵķ���
	// ������
	public abstract void buildPillars();
	// ��ǽ
	public abstract void buildWalls();
	
	// ����������Ĭ��ʵ�֣����Ա���д
	public void buildWindows(){
		System.out.println("ʹ�ò�������");
	}
	
	
}
