package com.designpattern.factory.factorymethod;
/**
 * ���� 
 * ˫����ģʽ/˫��У����DCL(double-checked locking)
 * ����˫����ģʽ���ڶ��߳�ͬ��������£����ɿ��Ա��ָ����ܣ���������װ�ص�
 * 
 */
public class Pear implements Fruit{
	private volatile static Pear pear;
	
	private Pear() {}

	public static Pear getInstance(){
		if(pear == null){
			synchronized(Pear.class){
				if(pear == null){
					pear = new Pear();
				}
			}
		}
		return pear;
	}

	@Override
	public void eat() {
		System.out.println("Eat Pear");
	}

}
