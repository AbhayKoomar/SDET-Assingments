package core_java;

import java.util.HashSet;
import java.util.Set;

public class Array_HashSet {
	public static void main(String[] args) {
		
		 Set<Integer> hs = new HashSet<Integer>();		 
	      hs.add(15);
	      hs.add(71);
	      hs.add(82);
	      hs.add(89);
	      hs.add(91);
	      hs.add(93);
	
	      System.out.println("Elements in set = "+hs);
	      System.out.println("Copying all elements..");
	      Object[] obArr = hs.toArray();
	      for (Object ob : obArr)
	      System.out.println(ob);
	   }
	}