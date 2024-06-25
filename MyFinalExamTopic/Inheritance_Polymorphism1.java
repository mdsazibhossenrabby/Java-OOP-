package FinalExam;

import java.util.Scanner;

public class Inheritance_Polymorphism1 {
    public static void main(String[] args) {
        Dog d1=new Dog(50,"Sparky","Black");
        System.out.println("Dog color : "+d1.color);
        System.out.println("Dog Weight : "+d1.getWeight());
        System.out.println("Dog Name : "+d1.getName());
        d1.sound();
        d1.eat();
    }
}


// superclass/parent class
class Animal{
    private int weight;
    private String name;
    
    public void sound(){
        System.out.println("Animal Sound");
    }
    public void eat(){
        System.out.println("Animal Food");
    }
    
    //getter setter methods for accessing private data feilds
    
    public void setWeight(int wt){
        this.weight=wt;
    }
    public int getWeight(){
        return weight;
    }
    
    public void setName(String nm){
        this.name=nm;
    }
    public String getName(){
        return name;
    }
}

//subclass/child class
class Dog extends Animal{
    String color;
    
    public Dog(){};
    
    public Dog(int wt,String nm,String cl){
        this.color=cl;
        setName(nm);
        setWeight(wt);
        
    }
    
    
    @Override
    public void sound(){
        System.out.println("Dog Barking");
    }
    
}
