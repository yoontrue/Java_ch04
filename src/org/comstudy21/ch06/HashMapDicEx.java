package org.comstudy21.ch06;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapDicEx {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("kim", "사장");
		map.put("lee", "비서");
		map.put("park", "종업원");
		
		Collection<String> values = map.values();		// HashMap의 Value값만 뽑아서 Collection 타입에 넣어줌.
		Iterator<String> valuesIter = values.iterator();
		while(valuesIter.hasNext()) {
			System.out.println(valuesIter.next());
		}
	}
	public static void main02(String[] args) {
		// 영어 단어와 한글 단어의 쌍을 저장하는 HashMap 컬렌션 생성
		HashMap<String, String> dic = new HashMap<String, String>();
		
		// 3개의 (key,value) 쌍을 dic에 저장
		dic.put("baby","아기");
		dic.put("love","사랑");
		dic.put("apple","사과");
		
		// dic 해시맵에 들어 있는 모든 (key, value) 쌍 출력
		Set<String> keys = dic.keySet();		// 모든 키를 Set 컬렉션에 받아옴
		
		Iterator<String> it = keys.iterator();		// Set에 접근하는 Iterator 리턴
		
		while(it.hasNext()) {
			String key = it.next();
			String value = dic.get(key);
			System.out.print("(" + key + "," + value + ")");
		}
		System.out.println();
		
		// 영어 단어를 입력받고 한글 단어 검
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<3;i++) {
			System.out.print("찾고 싶은 단어는?");
			String eng = scanner.next();
			// 해시맵에서 '키' eng의 '값' kor 검색
			String kor = dic.get(eng);
			if(kor == null) {
				System.out.println(eng + "는 없는 단어입니다.");
			} else {
				System.out.println(kor);
			} // end of if
		} // end of for
	} // end main
}
