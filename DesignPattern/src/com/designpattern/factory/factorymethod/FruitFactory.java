package com.designpattern.factory.factorymethod;

public class FruitFactory {
	public static Fruit getInstance(String fruitName){
		if(null == fruitName){
			return null;
		}
		if("Apple".equals(fruitName)){
			return Apple.getInstance();
		}else if("Pear".equals(fruitName)){
			return Pear.getInstance();
		}else if("Banana".equals(fruitName)){
			return Banana.getInstance();
		}
		return null;
	}
}
