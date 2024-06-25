package FinalExam;

import java.util.Scanner;

/**
 *
 * @author im-mdsazib
 */
//Creat Userdefined Exception Class
class InvalidAgeException1 extends Exception{
    
    public InvalidAgeException1(String msg){
        super(msg);
    }
}

public class UserdefinedException2 {
     
    //if it is not static , user must call it through object
    static void EligibilityCheck1(int age) throws InvalidAgeException1{ //Initialize user-defined Exception
        
        if(age<18){
            throw new InvalidAgeException1("This person is under 18 . Not Eligible for Voting"); //Throw excption
        }else{
            System.out.println("This Person is Eligble for Voting");
        }
        
    }
    
    public static void main(String[] args)  {
         Scanner input=new Scanner(System.in);
         
         System.out.println("Enter age of the Person :  ");
         int age1=input.nextInt();
        
        try{
            EligibilityCheck1(age1);
        }catch(InvalidAgeException1 Aex){
            System.out.println("There is an Exception Caught");
            System.out.println(Aex);
        }
        
        
    }
    
}
