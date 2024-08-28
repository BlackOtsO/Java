package helloworld;
import java.util.*;
public class HelloWorld {
   
	public static void main(String[] args) {
	Scanner o=new Scanner(System.in);
		HelloWorld obj =new HelloWorld();
		 int t=1,h=0;
		int n=o.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=o.nextInt();	
		}
		Arrays.sort(a);
	for(int i=0;i<n-1;i++)
	{
		if(a[i+1]==a[i]+1)
		{
			t++;
			h=t;
		}
		else
		{
			t=1;
		}
	}
	System.out.print(h);

}}
