package com.designpattern.factory.factorymethod;
/**
 * 单例
 * 饿汉模式
 * 由于是在类装载时初始化对象，这样通过classloader机制避免了多线程同步的问题，所以是线程安全的
 * 但正因为是在类装载时初始化才会产生垃圾对象，从而浪费内存
 * 同时它证明不是懒装载（lazy load）的，没有达到lazy loading的效果
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
