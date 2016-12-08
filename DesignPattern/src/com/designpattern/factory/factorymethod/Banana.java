package com.designpattern.factory.factorymethod;
/**
 * ����
 * ����ģʽ��һ��(�̰߳�ȫ��)
 * �߱��ܺõ���װ�أ��ܹ��ڶ��߳��кܺõĹ������ܹ���֤�̵߳İ�ȫ������Ч�ʵ���
 * ��Ϊֻ���ڼ�synchronized��������²��ܱ��ֵ�������Ӱ��Ч��
 * 
 */
public class Banana implements Fruit{
	private static Banana banana;
	
	private Banana() {}
	
	public static synchronized Banana getInstance(){
		if(banana == null){
			banana = new Banana();
		}
		return banana;
	}

	@Override
	public void eat() {
		System.out.println("Eat Banana");
	}

}
