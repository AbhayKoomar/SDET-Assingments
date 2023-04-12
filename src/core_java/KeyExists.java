package core_java;
import java.util.HashMap;
import java.util.Map;

public class KeyExists {
	public static void main(String[] args) {
		 {
		        Map<Character, Integer> hashMap = new HashMap<>();
		        hashMap.put('A', 1);
		        hashMap.put('B', 2);
		        hashMap.put('C', 3);		 
		        char key = 'C';
		        boolean isKeyExists = hashMap.keySet().stream().anyMatch(k -> k == key);		 
		        System.out.println(isKeyExists);
		    }
		}
}
		
	