public class AllDivisorsOfNumber {
public static void main(String[]args)
{
	int n1=200;
	int n2=5;
	dividor(n1);
}
public static void dividor(int n)
{
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
			System.out.print(i+" ");
	}
}
}