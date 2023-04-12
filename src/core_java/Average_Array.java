package core_java;

public class Average_Array {
	public static void main(String[] args) {
		
		int array [] = {1, 2, 3, 4, 5};
		 
        // getting array length
        int length = array.length;
 
        // default sum value.
        int sum = 0;
 
        // sum of all values in array using for loop
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        } 
        double average = sum / length;         
        System.out.println("Average of array : "+average); 
    }
}