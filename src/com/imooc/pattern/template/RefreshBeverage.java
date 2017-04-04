package com.imooc.pattern.template;

/**
 * ������࣬Ϊ���������ṩһ���㷨���
 * 
 * ��������
 */
public abstract class RefreshBeverage {

	/*
	 * �Ʊ����ϵ�ģ�巽�� ��װ���������๲ͬ��ѭ���㷨���
	 */
	public final void prepareBeverageTemplate() {
		// ����1����ˮ���
		boilWater();
		// ����2�� ��������
		brew();
		// ����3�� �����ϵ��뱭����
		pourInCup();
		if (isCustomerWantsCondiments()) {
			// ����4 �����ζ��
			addCondiments();
		}

	}

	// �������� ��ˮ��� (������������ԣ���һ����ͬ����Ϊ)
	private void boilWater() {
		System.out.println("��ˮ���");

	}

	// �������� ����Ϊ���󷽷�
	protected abstract void brew();

	// �������� �����ϵ��뱭����
	private void pourInCup() {
		System.out.println("�����ϵ��뱭��");

	}

	// �����ζ�� ����Ϊ���󷽷�
	protected abstract void addCondiments();

	/**
	 * ѯ���û��Ƿ�������
	 * Hook,���Ӻ������ṩһ��Ĭ�ϻ�յ�ʵ��
	 * ���������������о������Ƿ�ҹ����뼰��ιҹ�
	 * @return
	 */
	protected boolean isCustomerWantsCondiments() {
		return true;
	}

}
