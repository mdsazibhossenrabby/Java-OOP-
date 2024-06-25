package FinalExam;

public class StaticKeyword {
    public static void main(String[] args) {
        //there is no need to create object (though we can create) to access data fields
        StaticClass.age=10;
        System.out.println(StaticClass.age);
        
        StaticClass.sound();
    }
    
}

class StaticClass{
     static int age;
    
     static void sound(){
        System.out.println("This is static");
    }
}
