package core_java;

public class Character_Array {
	public static void main(String[] args) {
		
		String str = "Devlabs";	      
	      char[] ch = str.toCharArray();
	      System.out.println("Character Array..");
	      for (int i = 0; i < ch.length; i++) {
	         System.out.print(ch[i]+" ");
	      }
	   }
	}
