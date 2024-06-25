
//Mutithreding from Runnable Interface

package FinalExam;

public class Multithreading1 {
	public static void main(String[] args) {
		//Thread 1
		Tasks T1=new Tasks();
		T1.threadnumber=1;
		T1.a=10;
		Thread thread1=new Thread(T1);
		
		//Thread 2
		Tasks T2=new Tasks();
		T2.threadnumber=2;
		T2.a=10;
		Thread thread2=new Thread(T2);
		
		//Thread 3
		Runnable T3=new Tasks(3,10);
		Thread thread3=new Thread(T3);
		
		//3 threads starts
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
}

class Tasks implements Runnable{
	
	public int threadnumber=0;
	public int a;
	
	public Tasks() {
	}
	
	public Tasks(int tn,int a) {
		this.threadnumber=tn;
		this.a=a;
	}
	
	
	@Override
	public void run() {
		for(int i=0;i<a;i++) {
			System.out.println("Thread #"+threadnumber+" : "+i);
		}
	}
	
	
}