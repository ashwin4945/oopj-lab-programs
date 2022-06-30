import java.util.Scanner;
public class tempconversion 
{

	public static void main(String[] args) 
	{
		int choice;
		float f,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice\n"+"1.CELCIUS to FARENHEIT\n"+"2.FARENHEIT to CELCIUS");
		choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Enter your temperature in CELCIUS");
			c=sc.nextFloat();
			f=(9*c)/5+32;
			System.out.println("The temperature in FARENHEIT is "+f);
		}
		else
		{
			System.out.println("Enter your temperature in FARENHEIT");
			f=sc.nextFloat();
			c=((f-32)*5)/9;
			System.out.println("The temperature in CELCIUS is "+c);
		}
    }

}
