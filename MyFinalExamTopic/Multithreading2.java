//From Thread class

package FinalExam;

public class Multithreading2 {
	public static void main(String[] args) {
		
		//thread 1
		MyTasks thread1=new MyTasks();
		thread1.threadnumber=1;
		thread1.a=5;
		
		//thread 2
		MyTasks thread2=new MyTasks();
		thread2.threadnumber=2;
		thread2.a=7;
		
		//thread 2
		MyTasks thread3=new MyTasks();
		thread3.threadnumber=3;
		thread3.a=5;
		
		//Strat threads
		
		thread1.run(); //it will execute ass single thread
		//these two will execute as multithread
		thread2.start();
		thread3.start();
	}
}

class MyTasks extends Thread{
	 int threadnumber;
	 int a;
	char ch='a';
	
	public void run() {
		for(int i=0;i<a;i++) {
			System.out.println("Thread number #"+threadnumber+" : "+ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ch++;
		}
	}
}
