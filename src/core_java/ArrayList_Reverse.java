package core_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Reverse {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();  
        l.add("Mango");  
        l.add("Banana");  
        l.add("Mango");  
        l.add("Apple");  
        System.out.println("Before Reversing");  
        System.out.println(l.toString());  
          
        Collections.reverse(l);  
        System.out.println("After Reversing");  
        System.out.println(l);  
    }  
}