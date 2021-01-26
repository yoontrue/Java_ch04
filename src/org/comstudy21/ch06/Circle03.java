package org.comstudy21.ch06;

public class Circle03 {
	int radius;
	String name;
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle03 pizza;
		pizza = new Circle03();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle03 donut = new Circle03();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
