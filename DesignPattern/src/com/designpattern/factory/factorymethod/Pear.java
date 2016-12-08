package com.designpattern.factory.factorymethod;
/**
 * 单例 
 * 双检锁模式/双重校验锁DCL(double-checked locking)
 * 采用双检锁模式，在多线程同步的情况下，依旧可以保持高性能，并且是懒装载的
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
