//SquareRoot
public class Main {
public static void main(String[]args)
{
int n=23;
	System.out.println(squareRoot(n));
	System.out.println(Math.sqrt(n));

}
public static int squareRoot(int n)
{
	int t=0;
	for(int i=1;i<n;i++)
	{
		if(n%i==0 && i*i==n)
			t=i;
		if(i==n-1)
			return t;
	}
	return t;
	
}
}