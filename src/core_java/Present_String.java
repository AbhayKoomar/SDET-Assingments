package core_java;

public class Present_String {
	public static void main(String[] args) {
		
		String txt = "A brown fox ran away fast";
	    String str = "brown";
	    boolean result = txt.contains(str);
	    if(result) {
	      System.out.println(str + " is present in the string.");
	    }
	    else {
	      System.out.println(str + " is not present in the string.");
	    }
	  }
	}