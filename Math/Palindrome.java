//palindrome
public class Main {
public static void main(String[]args)
{
	int n=234321;
if(palindrome(n))
	System.out.print(true);
else
	System.out.print(false);
}
public static boolean palindrome(int n)
{
	if(n==rev(n))
		return true;
	else
		return false;
}
public static int  rev(int n)
{
	int rev=0;
	while(n!=0)
	{
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	return rev;
}
}

