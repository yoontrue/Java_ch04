package org.comstudy21.ch06;
import java.util.Scanner;

class Day {
	private String work;
	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
	}
	public void show() {
		if(work == null) {
			System.out.println("없습니다.");
		} else {
			System.out.println(work + "입니다.");
		}
	}
}
public class MonthSchedule {
	static Day[] d;
	static int day=0;
	static int menu=0;
	static String work=null;
	static Scanner scan = new Scanner(System.in);
	static Scanner scan2 = new Scanner(System.in);
	
	public MonthSchedule(int i) {
		d = new Day[i];
	}
	
	void finish() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
	
	void view() {
		System.out.print("날짜(1~30)?? ");
		day = scan.nextInt();
		if(d[day-1] == null) {		// show() 메소드에서의 [i]번째 널값 비교는 쓰잘데기 없음... 객체 자체가 널인지 비교해야함.
			System.out.println("할 일을 아직 입력하지 않았습니다.");
			return;
		}
		System.out.print(day + "일의 할 일은");
		d[day-1].show();
	}
	
	void input() {
		System.out.print("날짜(1~30)?? ");
		day = scan.nextInt();
		d[day-1] = new Day();	// 객체 저장할 공간 생성
		System.out.print("할일(빈칸없이입력)?? ");
		work = scan2.nextLine();
		d[day-1].set(work);	// 객체 저장
	}
	void run() {
		System.out.println("이번달 스케쥴 관리 프로그램");
		while(true) {
			System.out.println();
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				break;
			default:
				System.out.println("잘못입력하셨습니다. 1~3사이의 메뉴만 입력해주세요.");
				break;
			}
		}
	}

	public static void main(String[] args) {
		MonthSchedule  april = new MonthSchedule(30);
		april.run();		
	}
}
