package com.imooc.pattern.template;

/**
 * �������࣬�ṩ���Ʊ���ľ��巽��
 * @author lhf
 *
 */
public class Tea extends RefreshBeverage{

	// ��������---��
	@Override
	protected void brew() {
		System.out.println("��80�ȵ���ˮ���ݲ�Ҷ5����");
		
	}

	//�����ζ��---����
	@Override
	protected void addCondiments() {
	   System.out.println("����м�������");
		
	}
	
	/**
	 * ����ͨ�����ǵ���ʽѡ����ع��Ӻ���
	 * �����ṩһ�������Լ������ʵ��
	 */
	@Override
	protected boolean isCustomerWantsCondiments() {
		return false;
	}

}
