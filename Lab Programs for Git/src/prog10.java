import java.util.Random;

class NewThreadA implements Runnable 
{
	String name;
	Thread t;
	int a;

	Random r = new Random();
	
	NewThreadA()
	{
		
	}
	
	NewThreadA(String name) 
	{
		this.name = name;
		t = new Thread(this, name);
		System.out.println("New thread name: " + t);
		for(int i=0;i<5;i++)
		{
			a= r.nextInt(10);
		}
		
		t.start();
	}

	public void run() 
	{
		try 
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Randomly generated number = "+ a);
			}
			
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			System.out.println(name + " interrupted");
		}

		System.out.println("Child Thread "+name + " exiting");
	}
	int retNum()
	{
		return a;
	}
}

class NewThreadB extends NewThreadA implements Runnable 
{
	String name;
	Thread t;
	
	
	NewThreadB(String name,int b) 
	{
		this.name = name;
		t = new Thread(this, name);
		System.out.println("New thread name: " + t);
		a=b;
		t.start();
	}

	public void run() 
	{
			System.out.println("Square of the randomly generated number = "+a*a);

		System.out.println("Child Thread "+name + " exiting");
	}
}

class NewThreadC extends NewThreadA implements Runnable 
{
	String name;
	Thread t;
	
	NewThreadC(String name,int b) 
	{
		this.name = name;
		t = new Thread(this, name);
		System.out.println("New thread name: " + t);
		a=b;
		t.start();
	}

	public void run() 
	{
		System.out.println("Cube of the randomly generated number = " + a*a*a);

		System.out.println("Child Thread "+name + " exiting");
	}
}

public class prog10
{
	public static void main(String args[]) 
	{
		int b;
		
		NewThreadA ob1 = new NewThreadA("One");
		b=ob1.retNum();
		NewThreadB ob2 = new NewThreadB("Two",b);
		NewThreadC ob3 = new NewThreadC("Three",b);
	}
}