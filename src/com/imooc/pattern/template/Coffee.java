package com.imooc.pattern.template;

/**
 * �������࣬�ṩ�˿����Ʊ��ľ���ʵ��
 * @author lhf
 *
 */
public class Coffee extends RefreshBeverage{

	//��������--����
	@Override
	protected void brew() {
		System.out.println("�÷�ˮ���ݿ���");
		
	}

	//�����ζ��---�Ǻ�ţ��
	@Override
	protected void addCondiments() {
		System.out.println("�����Ǻ�ţ��");
	}
	

}
