package Prog5;
import java.util.Scanner;

class JavaLab              //SUPER CLASS
{
	int usn;
	String name;
	
	JavaLab()                //Default Constructor of class JavaLab
	{
		name="0";
		usn=0;
    }
	JavaLab(int usn,String name)
	{
		this.name=name;
		this.usn=usn;
    }
	void printDetails()
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("NAME : "+this.name);
		System.out.println("USN : "+this.usn);
	}
}

class JavaLab1 extends JavaLab            //SUBCLASS 1 of SUPERCLASS
{
	long phno;
	String branch;
	JavaLab1()
	{
		this.usn=0;
		this.name="0";
		this.branch="0";
		this.phno=0;
	}
	JavaLab1(int usn,String name,String branch,long phno)
	{
		super(usn,name);
		this.branch=branch;
		this.phno=phno;
	}
	void printDetails()
	{
		super.printDetails();
		/*System.out.println("NAME : "+this.name);
		System.out.println("USN : "+this.usn);*/
		System.out.println("BRANCH : "+this.branch);
		System.out.println("Phone Number : "+this.phno);
	}
}

class JavaLab2 extends JavaLab1      //SUBCLASS of SUBCLASS 1 (Multilevel inheritance)
{
	int sem;
	double cgpa;
	JavaLab2()
	{
		this.usn=0;
		this.name="0";
		this.branch="0";
		this.phno=0;
		this.sem=0;
		this.cgpa=0;
	}
	JavaLab2(int usn,String name,String branch,long phno,int sem,double cgpa)
	{
		super(usn,name,branch,phno);
		this.sem=sem;
		this.cgpa=cgpa;
	}
	void printDetails()
	{
		super.printDetails();
		/*System.out.println("NAME : "+this.name);
		System.out.println("USN : "+this.usn);
		System.out.println("BRANCH : "+this.branch);
		System.out.println("Phone Number : "+this.phno);*/
		System.out.println("SEMESTER : "+this.sem);
		System.out.println("CGPA : "+this.cgpa);
	}
}

class JavaLab3 extends JavaLab       //SUBCLASS 2 of SUPERCLASS (Multiple Inheritance)
{
	int dob;
	String place;
	JavaLab3()
	{
		this.usn=0;
		this.name="0";
		this.dob=0;
		this.place="0";
	}
	JavaLab3(int usn,String name,int dob,String place)
	{
		super(usn,name);
		this.dob=dob;
		this.place=place;
	}
	void printDetails()
	{
		super.printDetails();
		/*System.out.println("NAME : "+this.name);
		System.out.println("USN : "+this.usn);*/
		System.out.println("Year of Birth : "+this.dob);
		System.out.println("Place : "+this.place);
	}
}

/*class JavaLab4 extends JavaLab2
{
	int sub;
	JavaLab4(int usn,String name,String branch,long phno,int sem,double cgpa,int sub)
	{
	     super(usn,name,branch,phno,sem,cgpa);
	     this.sub=sub;
	}
}

class JavaLab4 extends JavaLab3
{
	int sub;
	JavaLab4(int usn,String name,String branch,long phno,int sem,double cgpa,int sub)
	{
	     super(usn,name,branch,phno,sem,cgpa);
	     this.sub=sub;
	}
}*/

public class Lab5 
{

	public static void main(String[] args) 
	{
		//objects of super class
		
		JavaLab Ashwin=new JavaLab(10,"Ashwin");
		JavaLab Aditya=new JavaLab(20,"Aditya");
		
		//objects of subclass1 i.e JavaLab1
		
		JavaLab1 Praneeth=new JavaLab1(30,"Praneeth","ISE",12345);
		
		
		//objects of subclass of subclass 1 i.e JavaLab 2
		
		JavaLab2 Hemanth=new JavaLab2(40,"Hemanth","CSE",21456,4,9.24);
		JavaLab2 Ashish=new JavaLab2(50,"Ashish","ISE",41250,5,9.57);
		
		//objects of subclass 2 i.e JavaLab3
		
		JavaLab3 Likhith=new JavaLab3(60,"Likhith",2002,"Mysore");
		
		//objects of 
		
		
		Ashwin.printDetails();
		Aditya.printDetails();
		Praneeth.printDetails();
		Hemanth.printDetails();
		Ashish.printDetails();
		Likhith.printDetails();
	}

}
