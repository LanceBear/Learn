package com.designpattern.factory.factorymethod;
/**
 * ����
 * ����ģʽ
 * ����������װ��ʱ��ʼ����������ͨ��classloader���Ʊ����˶��߳�ͬ�������⣬�������̰߳�ȫ��
 * ������Ϊ������װ��ʱ��ʼ���Ż�����������󣬴Ӷ��˷��ڴ�
 * ͬʱ��֤��������װ�أ�lazy load���ģ�û�дﵽlazy loading��Ч��
 * 
 */
public class Apple implements Fruit{
	private static final Apple apple = new Apple();
	
	private Apple() {}

	public static Apple getInstance(){
		return apple;
	}

	@Override
	public void eat() {
		System.out.println("Eat Apple");
	}

}
