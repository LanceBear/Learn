package com.designpattern.factory.factorymethod;
/**
 * 单例
 * 懒汉模式的一种(线程安全的)
 * 具备很好的懒装载，能够在多线程中很好的工作，能够保证线程的安全，但是效率低下
 * 因为只有在加synchronized锁的情况下才能保持单例，会影响效率
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
