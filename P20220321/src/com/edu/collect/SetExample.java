package com.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>(); // set: 중복값은 허용하지 않는다..중복된 값은 담지 않고 먼저 넣었다고 앞번호가 아니다.. 순서가 없으니까 몇번째 요소를 가져올 지 알수없다
		set.add("Hello");
		set.add("World");
		set.add("Good");
		set.add("World"); // 중복된 요소는 추가 불가
		set.remove("Good"); //Good 제거
		
		System.out.println("set 크기는: " + set.size());
		
		Iterator<String> iter = set.iterator(); // 반복하여 값을 하나씩 꺼낸다 : 반복자(=iterator)
		while(iter.hasNext()) {
			String result = iter.next(); //하나를 꺼내서 담겠다.. 
			System.out.println(result);
		}
		System.out.println("end of prog");
	}
}
