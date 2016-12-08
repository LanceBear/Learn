package com.designpattern.factory.factorymethod;
/**
 * ��������
 * ͨ��������������
 * 
 * @author condibear
 *
 */
public class FactoryMethodDemo {
	public static void main(String[] args) {
		Apple apple = (Apple)FruitFactory.getInstance("Apple");
		Pear pear = (Pear)FruitFactory.getInstance("Pear");
		Banana banana = (Banana)FruitFactory.getInstance("Banana");
		System.out.println(apple);
		System.out.println(pear); 
		System.out.println(banana); 
	}
}
