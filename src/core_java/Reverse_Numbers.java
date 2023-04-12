package core_java;

public class Reverse_Numbers {
	public static void main(String[] args) {
		
		int num = 123, reversed = 0;
	    for(;num != 0; num /= 10) {
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	    }
	    System.out.println("Reversed Number: " + reversed);
	  }
	}