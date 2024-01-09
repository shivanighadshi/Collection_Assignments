package Collections_Demo;

import java.util.TreeMap;

public class Search_Key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> Employee = new TreeMap<String, String>();
		
		Employee.put("Emp1", "Suraj");
		Employee.put("Emp2", "Rajesh");
		Employee.put("Emp3", "Priyanka");
		Employee.put("Emp4", "Rohita");
		
		System.out.println(Employee);
		
		if(Employee.containsKey("Emp2")) {
			System.out.println("Employee Treemap contains Emp2");
		}
		else {
			System.out.println("Employee Treemap dont contain Emp2");
		}
		if(Employee.containsKey("Emp7")) {
			System.out.println("Employee Treemap contains Emp7");
		}
		else {
			System.out.println("Employee Treemap dont contain Emp7");
		}

	}

}
