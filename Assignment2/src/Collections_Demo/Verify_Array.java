package Collections_Demo;

import java.util.ArrayList;

public class Verify_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("one");
		array1.add("two");
		array1.add("three");
		
		System.out.println("Array is empty: "+array1.isEmpty());
		
		System.out.println("array1: "+array1);
		
		array1.removeAll(array1);
		
		System.out.println("Array is empty: "+array1.isEmpty());
		
		
		System.out.println("array1: "+array1);
		
	}

}
