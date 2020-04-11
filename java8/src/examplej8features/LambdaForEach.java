package examplej8features;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEach {
public static void main(String[] args) {
	List<String>list=new ArrayList<String>();
	list.add("chaithra");
	list.add("vikram");
	list.add("harshith");
	list.add("ganeesha");
	list.add("shiva");
	list.forEach(
			(n)->System.out.println(n)
			);
}
}
