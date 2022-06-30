
class Table
{  
	synchronized void printTable(String s)
	{
			System.out.println(s);  
			try
			{  
				Thread.sleep(2000);  
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			} 
	}  
}  
  
class MyThread1 extends Thread
{  
	Table t;  
	MyThread1(Table t)
	{  
		this.t=t;  
	}  
	public void run()
	{  
		t.printTable("Hi");  
	}  
  
}  
class MyThread2 extends Thread
{  
	Table t;  
	MyThread2(Table t)
	{  
		this.t=t;  
	}  
	public void run()
	{  
		t.printTable("Hello!"); 
	}  
}  


public class threadsynchronization 
{

	public static void main(String[] args) 
	{
		Table obj = new Table();
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
	}

}
