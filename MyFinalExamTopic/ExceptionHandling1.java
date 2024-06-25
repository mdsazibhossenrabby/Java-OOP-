package FinalExam;

import java.util.Scanner;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
       
        //Catch Specific type exception
        try{
             System.out.print("Enter a Number : ");
            int num1=input.nextInt();
        
            System.out.print("Enter a Number  to devide: ");
            int num2=input.nextInt();
            
            float result=num1/num2; //this is arithmetic Exception
            System.out.println("The Result is : "+result);
            
        }catch(ArithmeticException aex){ //it only catch Arithmetic Exceptions 
            
            System.out.println("Found an Exception that number is not divisible by 0");
        }finally{
            //it will always execute either exception found or not
            System.out.println("Exception Handling1 is Working");
        }
        
        
        //Catch all Type of Exception
        
        try{
             System.out.print("Enter a Number : ");
            int num1=input.nextInt();
        
            System.out.print("Enter a Number  to devide: ");
            int num2=input.nextInt();
            
            float result=num1/num2; //this is arithmetic Exception
            System.out.println("The Result is : "+result);
            
        }catch(Exception allex){ //it only catch Arithmetic Exceptions 
            
            System.out.println("Found an Exception that number is not divisible by 0 or Character");
        }finally{//optional
            //it will always execute either exception found or not
            System.out.println("Exception Handling2 is Working");
        }
        
        
        
    }   
}

