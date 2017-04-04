package com.imooc.pattern.template;

public class RefreshBeverageTest {
	public static void main(String[] args) {
		System.out.println("咖啡制备中...");
		RefreshBeverage b1 = new Coffee();
		b1.prepareBeverageTemplate();
		System.out.println("咖啡好了....");
		
		System.out.println("\n********************************");
		System.out.println("开始制备茶...");
		RefreshBeverage b2 = new Tea();
		b2.prepareBeverageTemplate();
		System.out.println("茶制备好了....");
	}

}
