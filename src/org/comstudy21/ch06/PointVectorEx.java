package org.comstudy21.ch06;

import java.util.Vector;

class Point{
	private int x,y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

public class PointVectorEx {
	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		v.add(new Point(2,3));
		v.add(new Point(-5,11));
		v.add(new Point(20,32));
		
		System.out.println("===삭제전===");
		for(int i=0;i<v.size();i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
		System.out.println();
		
		v.remove(1);	// 두번째 값 삭제
		
		System.out.println("===삭제===");
		for(int i=0;i<v.size();i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
	}
}
