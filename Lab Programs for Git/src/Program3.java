import java.util.Scanner;

class student
{
	String usn;
	String name;
	String branch;
	String phno;
	Scanner sc=new Scanner(System.in);
	student(int i)
	{
		System.out.println("Enter the details of student "+(i+1));
		System.out.println("Enter NAME of student");
		this.name=sc.nextLine();
		System.out.println("Enter USN of student");
		this.usn=sc.nextLine();
		System.out.println("Enter BRANCH of student");
		this.branch=sc.nextLine();
		System.out.println("Enter Phone Number of student");
		this.phno=sc.nextLine();
	}
	void printDetails()
	{
		System.out.println("--------------------------------------------------------------");
		System.out.println("NAME : "+this.name);
		System.out.println("USN : "+this.usn);
		System.out.println("BRANCH : "+this.branch);
		System.out.println("Phone Number : "+this.phno);
	}
}
public class Program3 
{

	public static void main(String[] args) 
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students :");
		n=sc.nextInt();
		student a[]=new student [n];
		//System.out.println("Enter the names of "+n+" students :");
		for(i=0;i<n;i++)
		{
			a[i]=new student(i);
		}
		for(i=0;i<n;i++)
		{
			a[i].printDetails();
		}
	}

}
