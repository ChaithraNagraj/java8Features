package com.bridgelabz.functionalinterface;

public class FunctionalInterfaceExample implements sayable  {
public void say(String msg) {
	System.out.println(msg);
}
public static void main(String[] args) {
	FunctionalInterfaceExample file=new FunctionalInterfaceExample();
	file.say("Hello there");
}
}
