package Collections_Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Copy_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("grapes");
		fruits.add("kiwi");
		
		System.out.println("fruits list: "+fruits);
		
		
		List<String> veggies = new ArrayList<String>();
		veggies.add("onion");
		veggies.add("potato");
		veggies.add("tomato");
		veggies.add("spring onion");
		
		System.out.println("veggies list: "+veggies);
		
		Collections.copy(fruits, veggies);
		
		System.out.println("After Coping...");
		
		System.out.println("fruits: "+fruits);
		System.out.println("veggies: "+veggies);

	}

}
