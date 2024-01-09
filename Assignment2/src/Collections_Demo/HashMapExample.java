package Collections_Demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> hashmaps = new HashMap<String, String>();
        
        hashmaps.put("Rajesh", "Manager");
        hashmaps.put("Dharmendar", "Employee");
        hashmaps.put("heena", "Hr");
        
        System.out.println("HashMap Elements:");
        for(Map.Entry<String, String> entry : hashmaps.entrySet()) {
        	System.out.println("key: "+entry.getKey()+", value: "+entry.getValue());
        }
        
        String Jobroll = hashmaps.get("Dharmendar");
        System.out.println("\nJobroll of Dharmendar is "+Jobroll);
        
        String searchKey = "heena";
        if(hashmaps.containsKey(searchKey)) {
        	System.out.println(searchKey+" is present in HashMap");
        }
        else {
        	System.out.println(searchKey+" is not present in HashMap");
        }
    }
}
