package com.designpattern.factory.factorymethod;
/**
 * 单例
 * 懒汉模式的一种(不安全的)
 * 虽然实现了懒装载，但是由于没有synchronized锁，所以不能用于多线程环境下，严格上讲不算是单例
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
