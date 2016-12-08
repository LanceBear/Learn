package com.designpattern.factory.factorymethod;
/**
 * ����
 * ����ģʽ��һ��(����ȫ��)
 * ��Ȼʵ������װ�أ���������û��synchronized�������Բ������ڶ��̻߳����£��ϸ��Ͻ������ǵ���
 *
 */
public class Watermelon implements Fruit{
	private static Watermelon watermelon;
	
	private Watermelon() {}

	public static Watermelon getInstance(){
		if(watermelon == null){
			watermelon = new Watermelon();
		}
		return watermelon;
	}
	
	@Override
	public void eat() {
		System.out.println("Eat Watermelon");
	}

}
