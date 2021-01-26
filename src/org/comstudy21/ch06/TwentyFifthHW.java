package org.comstudy21.ch06;
import java.util.Scanner;

class Grade {
	private int math;
	private int science;
	private int english;
	public Grade() {
		this(0, 0, 0);
	}
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	public double average() {
		return math+science+english/3.0;
	}
}

public class TwentyFifthHW {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("수학,과학,영어 순으로 3개의 점수 입력 >>> ");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println(me.average());
		// 스캐너 닫아줄 때 그냥 닫는것 보다, 사용했을 때만 닫아주는게 좋다.
		if(scanner != null) scanner.close();
	}
}

//class TV{
//	String tvName;
//	int year;
//	int inch;
//	public TV(String tvName, int year, int inch) {
//		this.tvName = tvName;
//		this.year = year;
//		this.inch = inch;
//	}
//	public void show() {
//		System.out.println(tvName + "에서 만든 " + year + "년형 " + inch + "인치 TV");
//	}
//}
//
//public class TwentyFifthHW {
//	public static void main(String[] args) {
//		TV myTV = new TV("LG",2017,32);
//		myTV.show();
//	}
//}
