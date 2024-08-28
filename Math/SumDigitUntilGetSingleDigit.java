package helloworld;
import java.util.*;
public class HelloWorld {
   
public static int rev(int n)
{
	int sum = 0;
	 
    while (n > 0 || sum > 9) 
    {
        if (n == 0) {
            n = sum;
            sum = 0;
        }
        sum += n % 10;
        n /= 10;
    }
    return sum;
//	System.out.print(i+" "+j);
	
}
public static void main(String[] args) {
	Scanner o=new Scanner(System.in);
	int n=o.nextInt();
	int s=0;
	int a[]=new int[n];
	int b[]=new int[n];
	for(int i=0;i<n;i++)
		a[i]=o.nextInt();
	for(int i=0;i<n;i++)
	    {
		b[i]=rev(a[i]);
		
		
	    }
	    for(int i=0;i<n;i++)
		System.out.println(b[i]);
}}
