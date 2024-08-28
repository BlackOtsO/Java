public class Main {
public static void main(String[]args)
{
	int n=3;
	
		System.out.print(prime(n));
	
}
public static boolean prime(int n)
{
	for(int i=2;i<n;i++)
		if(n%i==0)
			return false;
		
	return true;
}
}
