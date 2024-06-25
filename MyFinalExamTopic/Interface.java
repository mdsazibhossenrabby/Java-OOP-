package FinalExam;

public class Interface {
    public static void main(String[] args) {
        
    }
}

interface Animal22{
    
    /* these all are constant variables , if user not write "public static final" before variables initialization ,
    the compiler will automatically detect it for interface*/
    public static final int age=10;
    public static  int weight=10;
    final  int height=10;
    static int number=10;
    public String name="Animal";
    String species="Homo";
    
     /* these all are abstract methods , if user not write "public abstract" before methods ,
    the compiler will automatically detect it for interface*/
    public abstract void sound();
    abstract void eat();
    public int cost();
    int price();
}

interface A{
    int a=10;
    public void a();
}
interface B extends A{
    int b=20;
    public void b();
}

class C implements  A{
    
    @Override
    public void a(){
        
    }
}

class D implements B{
    @Override
    public void b(){
        
    }
    
    @Override
    public void a(){
        
    }
}

class E implements A,B{
    @Override
    public void a(){
        
    }
    
    @Override
    public void b(){
        
    }
}
