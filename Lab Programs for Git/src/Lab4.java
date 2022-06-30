
import java.util.Scanner;

class JavaLab
{
	int usn;
	String name;
	String branch;
	long phno;
	JavaLab()                //Default Constructor
	{
		name="0";
		usn=0;
		branch="0";
	    phno=0;
    }
	JavaLab(int usn,String name,String branch,long phno)    //Constructor 1
	{
		this.name=name;
		this.usn=usn;
		this.branch=branch;
	    this.phno=phno;
    }
	JavaLab(int usn,String name)     //Constructor 2
	{
		this.name=name;
		this.usn=usn;
		branch="0";
	    phno=0;
    }
	void AddValues(int usn,String name,String branch)   //Member Function 1
	{
		this.name=name;
		this.usn=usn;
		this.branch=branch;
	    phno=0;
	}
	void AddValues(int usn,String name)       //Member Function 2
	{
		this.name=name;
		this.usn=usn;
		branch="0";
	    phno=0;
	}
	void OverRiding()
	{
		System.out.println("Method Overriding in class JavaLab");
	}
	void printDetails()
	{
		System.out.println("NAME : "+this.name);
		System.out.println("USN : "+this.usn);
		System.out.println("BRANCH : "+this.branch);
		System.out.println("Phone Number : "+this.phno);
		System.out.println("--------------------------------------------");
	}
}

class JavaLab1 extends JavaLab
{
	double cgpa;
	String place;
	JavaLab1(int usn,String name,String branch,long phno,double cgpa,String place)
	{
		super(usn,name,branch,phno);
		this.cgpa=cgpa;
		this.place=place;
	}
	void OverRiding()
	{
		//super.OverRiding();
		System.out.println("Method Overriding in class JavaLab1");
	}
	void printDetails()
	{
		System.out.println("NAME : "+this.name);
		System.out.println("USN : "+this.usn);
		System.out.println("BRANCH : "+this.branch);
		System.out.println("Phone Number : "+this.phno);
		System.out.println("CGPA : "+this.cgpa);
		System.out.println("PLACE : "+this.place);
		System.out.println("--------------------------------------------");
	}
}			
	
public class Lab4 
{

	public static void main(String[] args) 
	{
		JavaLab Ashwin=new JavaLab(10,"Ashwin","ISE",12345);
		JavaLab Ashish=new JavaLab(20,"Ashish");
		JavaLab Aditya=new JavaLab();
		Aditya.AddValues(30,"Aditya","CSE");
		JavaLab Praneeth=new JavaLab();
		Praneeth.AddValues(40,"Praneeth");
		
		
		Ashwin.printDetails();
		Ashish.printDetails();
		Aditya.printDetails();
		Praneeth.printDetails();
		
	
		JavaLab1 Hemanth=new JavaLab1(50,"Hemanth","EEE",654123,9.62,"Mysore");
		Hemanth.printDetails();
		
		Ashwin.OverRiding();
		Hemanth.OverRiding();
	}

}
