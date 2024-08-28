package helloworld;
import java.util.*;
public class HelloWorld {
   public static void main(String[] args) {

	int n=1123456789;//97654213
	int dub=n;
	int len=0;
	int max=0;
	int count=0;
	ArrayList<Integer>arrlist=new ArrayList<Integer>();
	while(n>0)
	{
		int rem=n%10;
		arrlist.add(rem);
		n=n/10;
	}
	int Size=arrlist.size();
	int a[]=new int[Size];
	for(int i=Size-1;i>=0;i--)
		a[i]=arrlist.get(Size-i-1);
	for(int i=1;i<Size;i++)
	{
		if(a[i]==a[i-1]+1)
			count++;
		else
		{
			count=0;
		}
		max=Math.max(max,count);
	}
	System.out.print(max+1);
}
		
}
