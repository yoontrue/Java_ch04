package org.comstudy21.ch06;
class ArrayUtil{
	private static int[] c;
	public static int[] concat(int[] a, int[] b) {
		c = new int[a.length+b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);		
		return c;
	}
	
	public static void print(int[] a) {
		for(int i=0;i<c.length;i++) {
			System.out.print(a[i] + "  ");
		}
	}
}
public class StaticEx {
	public static void main(String[] args) {
		int[] array1 = {1,5,7,9};
		int[] array2 = {3,6,-1,100,77};
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}
