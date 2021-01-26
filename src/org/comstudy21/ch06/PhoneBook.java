package org.comstudy21.ch06;

import java.util.Scanner;

class Phone{
	private String name;
	private String tel;
	
	public Phone() {
		
	}
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}	
}
public class PhoneBook {
	static Scanner sc = new Scanner(System.in);	// 숫자용
	static Scanner sc2 = new Scanner(System.in); // 문자용
	static Phone p[];
	public static void main(String[] args) {
		int personNum;
		String name;
		String tel;
		System.out.print("인원수 >>> ");
		personNum = sc.nextInt();
		
		while(personNum < 1) {		// 인원수 무결성체크
			System.out.print("인원수는 1 이상의 양수 >> ");
			personNum = sc.nextInt();
		}
		
		p = new Phone[personNum];
		
		for(int i=0;i<personNum;i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>> ");
			name = sc2.next();
			tel = sc2.next();
			p[i] = new Phone(name,tel);
		}
		
		System.out.println("저장되었습니다...");
		
		while(true) {
			System.out.print("검색할 이름 >> ");
			name = sc2.next();
			com : if(name.equals("그만")) {
				System.out.println("프로그램 종료.");
				System.exit(0);
			}else {
				for(int i=0;i<personNum;i++) {
					if(name.equals(p[i].getName())) {	// 이름 같으면?
						System.out.printf("%s의 번호는 %s 입니다.\n",p[i].getName(),p[i].getTel());
						break com;	// 이름 같은거 찾고도 밑에줄 ~이 없습니다.가 나오지 않게 아예 비교문 빠져나가게 함.
					}
				}	// for문 끝.
				System.out.println(name + "이 없습니다.");
			}	// 그만인지 이름인지 비교 끝.
		}	// while 끝.
	}
}
