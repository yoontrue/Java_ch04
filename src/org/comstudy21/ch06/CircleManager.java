package org.comstudy21.ch06;
import java.util.Scanner;
class Circle {
	private double x, y;
	private int radius;

	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
	
	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}
}

public class CircleManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c[] = new Circle[3];		// 이 때는 아직 레퍼런스만 생성한거!

		for(int i=0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble(); // x값 읽기.
			double y = scanner.nextDouble(); // y값 읽기.
			int radius = scanner.nextInt();// radius값 읽기.
			c[i] = new Circle(x,y,radius); // Circle 객체 생성
		}
		
		int max = 0;	// radius 최대값 저장할 거.
		for(int i=0; i<c.length; i++) {
			if(max < c[i].getRadius()) {
				max = c[i].getRadius();		// max 에 가장 큰 반지름 넣기
			}
		}
		for(int i=0; i<c.length; i++) {
			if(max == c[i].getRadius()) {	// 아까 찾았던 max반지름 값과 같은 반지름을 가지고 있는 배열이면,
				c[i].show();				// 출력하기~
			}
		}
		scanner.close();
	}
}