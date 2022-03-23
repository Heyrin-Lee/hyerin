package com.edu.generic;

//ArrayiList<Integer..String..등이 올 수 있다> <- generic 이라고 한다
public class Box<T>{ //<T>를 generic이라고 하는데, 데이터타입이 아직 정해지지 않았지만 선언하는 시점에 정해지게 해두고 모두 적용가능하게 해두는 것이다.
	T obj;
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return this.obj;
	}

}
