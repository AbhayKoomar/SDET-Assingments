package core_java;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {
	public static void printDuplicate(String str) {
		
		Map<Character, Integer> charMapCount = new HashMap<>();
		for (int i = 0; i < str.length(); i++) { 
        Character ch = str.charAt(i);
        if (charMapCount.containsKey(ch)) { 
        charMapCount.put(ch, charMapCount.get(ch) + 1);
        } else { 
              charMapCount.put(ch, 1); 
        } 
        } 
        charMapCount.forEach((k, v) -> {
        	if(v > 1) {
               System.out.println(k);
            }
        });
   } 
   public static void main(String[] args) { 
         String str = "Devlabs Alliance";
         printDuplicate(str);
    }
}