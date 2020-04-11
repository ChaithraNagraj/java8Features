package examplej8features;
interface addable1{
	int add(int a, int b);
}
public class LAmbdaWithReturnType {
public static void main(String[] args) {
	//Lambda exp without return keyword
	addable1 add1=(a,b)->(a+b);
	System.out.println(add1.add(1122, 12));
	//with return type
	addable1 add2=(int a, int b)->{
		return(a+b);
	};
	System.out.println(add2.add(163, 11));
	}
}
