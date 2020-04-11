package examplej8features;

//taking single parameter

interface sayable{
	public String say(String name);
}
public class LambdaSingleParameterExp {
public static void main(String[] args) {
	sayable s1=(name)->{
		return " Hello,"+name;
	};
	System.out.println(s1.say("sonoo"));
	//we can ovmity function paranthesses
	sayable s2=name->{
		return "Hello,"+name;
	};
	System.out.println(s2.say("sonoo"));
}
}
