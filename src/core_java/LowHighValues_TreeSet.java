package core_java;

import java.util.TreeSet;

public class LowHighValues_TreeSet {
	public static void main(String[] args) {
		
		 TreeSet<Integer> treeSet = new TreeSet<Integer>();
	      treeSet.add(50);
	      treeSet.add(100);
	      treeSet.add(150);
	      treeSet.add(200);
	      treeSet.add(250);
	      treeSet.add(300);
	    
	      System.out.println("TreeSet Lowest value = " + treeSet.first());
	      System.out.println("TreeSet Highest value = " + treeSet.last());
	   }
	}