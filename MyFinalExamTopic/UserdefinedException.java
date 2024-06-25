package FinalExam;

import java.util.Scanner;

/**
 *
 * @author im-mdsazib
 */
//Creat Userdefined Exception Class
class InvalidAgeException extends Exception{
    
    public InvalidAgeException(String msg){
        super(msg);
    }
}

public class UserdefinedException {
    public static void main(String[] args)  {
         Scanner input=new Scanner(System.in);
         
        Voting p1=new Voting();
        System.out.print("Enter Age :  ");
        p1.age=input.nextInt();
        
        try{
            p1.EligibilityCheck();
        }catch(InvalidAgeException Aex){
            System.out.println("There is an Exception Caught");
            System.out.println(Aex);
        }
        
        
    }
    
}

class Voting{
   
    int age;
    
    void EligibilityCheck() throws InvalidAgeException{ //Initialize user-defined Exception
        
        if(age<18){
            throw new InvalidAgeException("This person is under 18 . Not Eligible for Voting"); //Throw excption
        }else{
            System.out.println("This Person is Eligble for Voting");
        }
        
    }
}
