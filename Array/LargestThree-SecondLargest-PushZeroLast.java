package pack;
import java.util.*;
public class testing {
	
	
	public static void three(int a[],int n)
	{
		
	int f,s,t;
	//f=s=t=Integer.MIN_VALUE;
	f=s=t=0;
	for(int i=0;i<n;i++)
	{
		if(a[i]>f)
		{
			t=s;
			s=f;
			f=a[i];
		}
		else if(a[i]>s)
			{t=s;
		    s=a[i];}
		else if(a[i]>t)
		{
			t=a[i];
		}
		    
	}
	System.out.println(f+" "+s+" "+t);
	
	}
	public static void second(int a[],int n)
	{
		int f,s;
		//f=s=Integer.MIN_VALUE;
		f=s=0;
		for(int i=0;i<n;i++)
		{
		if(a[i]>f)
		{
			s=f;
			f=a[i];
		}
		else if(a[i]>s)
			s=a[i];
		}
		System.out.println(s);
	}
	public static void Zerolast(int a[],int n)
	{
		int t=0;
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			if(a[i]!=0)
				b[t++]=a[i];
				
		}
		for(int i=0;i<n;i++)
			System.out.print(b[i]+" ");
	}
	public static void main(String[]args)
	{
		
		Scanner o=new Scanner(System.in);
		System.out.println("Enter number");
		int n=o.nextInt();
		System.out.println("Enter value");
		int a[]=new int [n];
		for(int i=0;i<n;i++)
			a[i]=o.nextInt();
		three(a,n);
		second(a,n);
		Zerolast(a,n);
		
		
						
	}
		
	}
