package core_java;

public class ArithmeticException {
	void division(int a, int b)  
    {  
        int result = a / b;  
        System.out.println("Division successfull.");  
        System.out.println("Result: " + result);  
    }   
   
    public static void main(String argvs[])
    {  
        ArithmeticException obj1 = new ArithmeticException(); 
        obj1.division(180,0);  
    }  
}