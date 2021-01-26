package org.comstudy21.ch06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ch06Ex01Set {
	static Random rand = new Random();
	
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		while(lotto.size() < 6) {
			lotto.add(rand.nextInt(45)+1);
		}
		
		Iterator<Integer> iter = lotto.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next() + "\t");
		}
	}
	
	public static void main02(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("오징어");
		set.add("꼴뚜기");
		set.add("오징어");
		set.add("대구");
		System.out.println("현재 set에 담긴 데이터의 수 : " + set.size());
		
		// set을 이터레이터로 바꿔줘서 출력.
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {	// 다음값이 있니 
			System.out.println(iterator.next());	// 출력하고 다음값으로 넘어감
		}
		
		// set을 배열로 옮겨담아 출력.
		// set에 있는 내용을 옮겨 담을 배열 선언.
		String[] fishArr = new String[set.size()];
		set.toArray(fishArr);
		for(String fish : fishArr) {
			System.out.println(fish);
		}
	}
}
