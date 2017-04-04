package com.imooc.pattern.template;

/**
 * 具体子类，提供了制备茶的具体方法
 * @author lhf
 *
 */
public class Tea extends RefreshBeverage{

	// 泡制饮料---茶
	@Override
	protected void brew() {
		System.out.println("用80度的热水浸泡茶叶5分钟");
		
	}

	//加入调味料---柠檬
	@Override
	protected void addCondiments() {
	   System.out.println("向茶中加入柠檬");
		
	}
	
	/**
	 * 子类通过覆盖的形式选择挂载钩子函数
	 * 并且提供一个符合自己需求的实现
	 */
	@Override
	protected boolean isCustomerWantsCondiments() {
		return false;
	}

}
