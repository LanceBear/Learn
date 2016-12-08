package com.designpattern.factory.factorymethod;
/**
 * 各个单例
 * 通过工厂创建出来
 * 
 */
public class FactoryMethodDemo {
	public static void main(String[] args) {
		//创建一个水果工厂
		FruitFactory fruitFactory = new FruitFactory();
		//依据水果类型产出水果    
		Apple apple = (Apple)fruitFactory.getInstance("Apple");
		Pear pear = (Pear)fruitFactory.getInstance("Pear");
		Banana banana = (Banana)fruitFactory.getInstance("Banana");
		Mango mango  = (Mango)fruitFactory.getInstance("Mango");
		Watermelon watermelon  = (Watermelon)fruitFactory.getInstance("Watermelon");
		System.out.println("*-*-*-*-*-*\n线程安全的");
		System.out.println(apple);
		System.out.println(pear); 
		System.out.println(banana); 
		System.out.println(mango);
		System.out.println("*-*-*-*-*-*\n线程不安全的");
		System.out.println(watermelon);
		//吃掉
		apple.eat();
		pear.eat();
		banana.eat();
		mango.eat();
		watermelon.eat();
	}
}
