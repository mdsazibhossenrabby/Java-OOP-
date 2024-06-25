package FinalExam;

public class SuperKeyword {
	public static void main(String[] args) {
		
		CallSuperClassConsrtuctor obj1=new CallSuperClassConsrtuctor(23,"SAZIB",3.9F);
		obj1.print();
		
		CallSuperClassMethod obj2 = new CallSuperClassMethod();
		obj2.age=23;
		obj2.name="MD.SAZIB";
		obj2.cgpa=3.9F;
		obj2.dept="CSE";
		obj2.printDetails();
	}
}




class SuperClass{
	int age;
	String name;
	
	SuperClass(){
		
	}
	
	SuperClass(int a, String nm){
		this.age=a;
		this.name=nm;
	}
	
	void print() {
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
	}
}





class CallSuperClassConsrtuctor extends SuperClass{
	float cgpa;
	
	public CallSuperClassConsrtuctor() {
		// TODO Auto-generated constructor stub
	}
	
	
	//Calling Superclass Constructor
	public CallSuperClassConsrtuctor(int a,String nm, float cg){
		super(a,nm); //Must be the first statement of the calling constructor
		this.cgpa=cg;
	}
	
	@Override
	void print() {
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
		System.out.println("CGPA is : "+cgpa);
	}
}



class CallSuperClassMethod extends SuperClass{
	float cgpa;
	String  dept;
	
	//Calling Superclass Method
	void printDetails() {
		super.print();
		System.out.println("CGPA is : "+cgpa);
		System.out.println("Department is : "+dept);
		// super.print();  can be here also , there is no restriction
	}
	
	
}
