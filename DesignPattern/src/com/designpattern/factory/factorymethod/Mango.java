package com.designpattern.factory.factorymethod;
/**
 * 单例
 * 登记式/静态内部类
 * 使用静态域进行延迟初始化，实现了懒装载，也实现了线程安全
 * 当类装载时只是装载了Mango类，但mango并没有被装载
 * 只有其显示的调用getInstance方法时才会装载MangoHolder类 ,从而实现对mango的实例化
 * 但相对于饿汉模式，这种方式只适用于静态域的情况下
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
