package org.comstudy21.ch06;

import java.util.Scanner;

class Dictionary {
	private static String[] kor = {"사랑","아기","돈","미래","희망"};
	private static String[] eng = {"love","baby","money","future","hope"};
	public static String kor2Eng(String word) {	// 검색코드작성
		String print = "";
		for(int i=0;i<eng.length; i++) {
			if(word.equals(eng[i])) {	// eng[i]번째가 들어온 word값이랑 같니?
				return String.format("%s는 %s", word, eng[i]);
			} else {
				return String.format("%s는 저의 사전에 없습니다.", word);
			}
		}
		return print;
	}
}

public class DicApp {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String word;
		System.out.println("한영 단어 검색 프로그램입니다.");
		System.out.print("한글 단어 ? ");
		word = sc.next();
		Dictionary.kor2Eng(word);
		
	}
}
