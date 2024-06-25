package FinalExam;

import java.util.Scanner;

public class ThrowThrows {
    
    void Result(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Divisor is 0");
        }else{
            float result=(float)a/b;
            System.out.println("The division result is : "+result);
        }
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int a,b;
        System.out.print("Enter  number : ");
        a=input.nextInt();
        System.out.print("Enter Divisor number : ");
        b=input.nextInt();
        
        ThrowThrows t=new ThrowThrows();
        
        
        try{
            t.Result(a,b);
        }catch(ArithmeticException e){ //we can write Exception also instead of ArithmeticException
            
            System.out.println("Found an Exception");
            
            System.out.println(e);
        }
        
    }
    
}
