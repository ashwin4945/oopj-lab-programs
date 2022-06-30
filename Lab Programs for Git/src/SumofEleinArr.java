import java.util.Scanner;
public class SumofEleinArr {

	public static void main(String[] args) 
	{
        int n,i,sum=0;
        int a[]=new int [50];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n=sc.nextInt();
        System.out.println("Enter "+n+" elements");
        for(i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
        	sum+=a[i];
        }
        System.out.println("The sum of elements in the array = "+sum);
	}

}
