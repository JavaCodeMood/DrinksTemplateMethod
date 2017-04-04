package com.imooc.pattern.template;

/**
 * 具体子类，提供了咖啡制备的具体实现
 * @author lhf
 *
 */
public class Coffee extends RefreshBeverage{

	//泡制饮料--咖啡
	@Override
	protected void brew() {
		System.out.println("用沸水冲泡咖啡");
		
	}

	//加入调味料---糖和牛奶
	@Override
	protected void addCondiments() {
		System.out.println("加入糖和牛奶");
	}
	

}
