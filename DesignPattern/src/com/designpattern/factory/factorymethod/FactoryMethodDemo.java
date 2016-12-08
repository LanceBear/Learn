package com.designpattern.factory.factorymethod;
/**
 * ��������
 * ͨ��������������
 * 
 */
public class FactoryMethodDemo {
	public static void main(String[] args) {
		//����һ��ˮ������
		FruitFactory fruitFactory = new FruitFactory();
		//����ˮ�����Ͳ���ˮ��    
		Apple apple = (Apple)fruitFactory.getInstance("Apple");
		Pear pear = (Pear)fruitFactory.getInstance("Pear");
		Banana banana = (Banana)fruitFactory.getInstance("Banana");
		Mango mango  = (Mango)fruitFactory.getInstance("Mango");
		Watermelon watermelon  = (Watermelon)fruitFactory.getInstance("Watermelon");
		System.out.println("*-*-*-*-*-*\n�̰߳�ȫ��");
		System.out.println(apple);
		System.out.println(pear); 
		System.out.println(banana); 
		System.out.println(mango);
		System.out.println("*-*-*-*-*-*\n�̲߳���ȫ��");
		System.out.println(watermelon);
		//�Ե�
		apple.eat();
		pear.eat();
		banana.eat();
		mango.eat();
		watermelon.eat();
	}
}
