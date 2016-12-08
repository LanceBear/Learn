package com.designpattern.factory.factorymethod;
/**
 * ����
 * ����ģʽ
 * �߱��ܺõ���װ�أ��ܹ��ڶ��߳��кܺõĹ������ܹ���֤�̵߳İ�ȫ������Ч�ʵ���
 * ��Ϊֻ���ڼ�synchronized��������²��ܱ��ֵ�������Ӱ��Ч��
 * 
 * @author condibear
 *
 */
public class Banana implements Fruit{
	private static Banana banana;
	
	private Banana() {
		super();
		// TODO Auto-generated constructor stub
	}
	
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
