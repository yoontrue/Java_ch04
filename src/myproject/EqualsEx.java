package myproject;

class Point{
	int x,y;
	
	public Point(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	
	public boolean equals(Point p) {
		if(x==p.x && y==p.y) {
			return true;
		}else {
			return false;
		}
	}	
}

public class EqualsEx {
	
	public static void main(String[] args) {
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		if(a==b) System.out.println("a==b");
		if(a.equals(b)) System.out.println("a is equal to b");
		if(b.equals(c)) System.out.println("b is equal to c");
	}

}
