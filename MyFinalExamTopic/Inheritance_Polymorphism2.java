package FinalExam;

public class Inheritance_Polymorphism2 {
    public static void main(String[] args) {
        Dog1 d1=new Dog1();
        d1.sound();
        d1.sleep();
    }
}


// superclass/parent class
class Animal1{
        int age;
        String name;
       public void sound(){
        System.out.println("Animal Sound");
    }
       public Animal1(){};
    
       public Animal1(int a,String nm){
           this.age=a;
           this.name=nm;
       }
}

//subclass/child class
class Dog1 extends Animal1{
    
    String catFood;
    public Dog1(){};
    
    //Calling Constructor using Super Keyword
    public Dog1(int a,String nm,String cf){
         super(a,nm);
        this.catFood=cf;
       
    }
   
    
    //Callling mathods using Super Keyword
    @Override
    public void sound(){
        super.sound();
        System.out.println("Dog Barking");
    }
    
    public void sleep(){
        System.out.println("I am Sleeping");
        super.sound();
    }
    
}

