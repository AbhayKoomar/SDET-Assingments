package core_java;
import java.util.ArrayList;
import java.util.Collections;
public class SortArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		 
		list.add("Volkswagen");   
		list.add("Toyota");   
		list.add("Porsche");   
		list.add("Ferrari");   
		list.add("Mercedes-Benz");   
		list.add("Audi"); 
				 
		System.out.println("Before Sorting: "+ list);		
		Collections.sort(list);	 
		System.out.println("After Sorting: "+ list);   
		}   
		}
