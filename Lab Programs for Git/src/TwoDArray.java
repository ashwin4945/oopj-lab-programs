import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) 
	{
		int i,j,m,n;
		int a[][] = new int [50][50];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("Enter "+m*n+" elements");
        for(i=0;i<m;i++)
        {
        	for(j=0;j<n;j++)
        	{
        		a[i][j]=sc.nextInt();
        	}
        }
        System.out.println("The ARRAY is :");
        for(i=0;i<m;i++)
        {
        	for(j=0;j<n;j++)
        	{
        		System.out.print(a[i][j]+" ");
        	}
        	System.out.print("\n");
        }
	}

}
