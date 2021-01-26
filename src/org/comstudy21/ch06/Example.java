package org.comstudy21.ch06;

class Person {
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}


class Power{
	private int kick;
	private int punch;
	public int getKick() {
		return kick;
	}
	public void setKick(int kick) {
		this.kick = kick;
	}
	public int getPunch() {
		return punch;
	}
	public void setPunch(int punch) {
		this.punch = punch;
	}
}
public class Example {
	public static void main(String[] args) {
		Power robot = new Power();
		robot.setKick(10);
		robot.setPunch(20);
	}
}

//	public static void main07(String[] args) {
//		Person aperson = new Person();
//		aperson.setAge(17);
//	}