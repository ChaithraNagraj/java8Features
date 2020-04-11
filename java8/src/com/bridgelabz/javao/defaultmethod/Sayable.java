package com.bridgelabz.javao.defaultmethod;

public interface Sayable {
//Default method
	default void say() {
		System.out.println("hello there");
	}
	//Abstract method
	void sayMore(String msg);
}
