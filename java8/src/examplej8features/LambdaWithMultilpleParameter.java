package examplej8features;
interface addable{
	int add(int a, int b);
}
public class LambdaWithMultilpleParameter {
public static void main(String[] args) {
	addable add1=(a,b)->(a+b);
	System.out.println((add1.add(23,32)));
	
	//multiple parameter with data type int
	addable add2=(int a, int b)->(a+b);
	System.out.println(add2.add(100,200));
}
}
