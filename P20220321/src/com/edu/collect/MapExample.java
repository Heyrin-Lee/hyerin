package com.edu.collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		// Map: {key:value}, {key1:value1} key에 해당되는 value 값이 묶여서 저장된다. key 와 value에 해당되는 각각의 타입을 지정해주어야 한다  
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("전민욱", 80); // 추가 기능 put
		map.put("김형민", 82);
		map.put("김영민", 85); // key 값은 중복으로 같은 값이 들어올 수 없다. 중복된 값이 들어오면 기존에 있던 값은 새로 들어온 값에 덮어쓰기 된다.(=기존에 있던 key값은 삭제됨)
		// 컬렉션: 여러 값을 저장=> 여러 요소에 접근하는 방법이 다르다
		
		Integer val = map.get("전민욱"); 
		System.out.println(val); //80.. key값을 입력하면 val 값을 리턴해준다
		
		Set<String> keySet = map.keySet(); //map 컬렉션에 저장된 요소들의 key에 해당되는 값만 set컬렉션에 담아주었다. ==>keyset이라는 이름의 Set 컬렉션을 만들었는데 map컬렉션 안에 있는 key값들을 Set 컬렉션 안에 넣는다.((map.KeySet에서 KeySet은 key값을 set(저장)한다))
		// 방법 1)
		Iterator<String> iter = keySet.iterator();// 반복요소 기능을 가진 반복자 생성
		
		while(iter.hasNext()) { //hasNext: 가지고 올 값이 있나? 있으면 반복
			String key = iter.next();
			Integer value = map.get(key);
			System.out.printf("key: %5s, value: %5d \n", key, value); //key=string, value=integer
		}
		
		//방법 2) for( : ) 확장 for문
		for(String key : keySet) { //set컬렉션 안에 있는 갯수만큼 반복하겠다
			Integer value = map.get(key);
			System.out.printf("key: %5s, value: %5d \n", key, value);
		}
		
		
		System.out.println("end of prog");
	}
}
