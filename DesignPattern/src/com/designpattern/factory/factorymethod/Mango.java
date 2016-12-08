package com.designpattern.factory.factorymethod;
/**
 * ����
 * �Ǽ�ʽ/��̬�ڲ���
 * ʹ�þ�̬������ӳٳ�ʼ����ʵ������װ�أ�Ҳʵ�����̰߳�ȫ
 * ����װ��ʱֻ��װ����Mango�࣬��mango��û�б�װ��
 * ֻ������ʾ�ĵ���getInstance����ʱ�Ż�װ��MangoHolder�� ,�Ӷ�ʵ�ֶ�mango��ʵ����
 * ������ڶ���ģʽ�����ַ�ʽֻ�����ھ�̬��������
 */
public class Mango implements Fruit {
	private static class MangoHolder{
		private static final Mango mango = new Mango();
	}
	
	private Mango() {}
	
	public static final Mango getInstance(){
		return MangoHolder.mango;
	}

	@Override
	public void eat() {
		System.out.println("Eat Mango");
	}

}
