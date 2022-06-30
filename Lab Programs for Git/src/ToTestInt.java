
interface test
{
	void square(int a);
	default void cube(int a)
	{
		System.out.println(a*a*a);
	}
}

class arithmetic implements test
{
	public void square(int a)
	{
		System.out.println("This is inside the square function");
		System.out.println(a*a);
	}
}


public class ToTestInt {

	public static void main(String[] args) 
	{
		System.out.println("Now we are in the main class");
		arithmetic obj = new arithmetic();
		System.out.println("Object created here");
		obj.square(4);
		obj.cube(4);
		System.out.println("We are now back to the main class");

	}

}
