package com.designpattern.factory.factorymethod;

public class FruitFactory {
	public Fruit getInstance(String fruitType){
		if(null == fruitType){
			return null;
		}
		if("Apple".equals(fruitType)){
			return Apple.getInstance();
		}else if("Pear".equals(fruitType)){
			return Pear.getInstance();
		}else if("Banana".equals(fruitType)){
			return Banana.getInstance();
		}else if("Watermelon".equals(fruitType)){
			return Watermelon.getInstance();
		}else if("Mango".equals(fruitType)){
			return Mango.getInstance();
		}
		return null;
	}
}
