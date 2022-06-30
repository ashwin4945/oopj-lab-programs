import java.util.Scanner;
public class primenumbers 
{
	public static void main(String[] args)
	{
		int n,i,j,valid=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number until which prime numbers are to be printed");
		n=sc.nextInt();
		for(i=2;i<=n;i++)
		{
			valid=1;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					valid=0;
				}
			}
			if(valid==1)
			{
				System.out.print(i+" ");
			}
		}
	}

}
