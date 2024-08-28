package helloworld;
import java.util.*;
public class HelloWorld {	
		public static void main(String[]args)
		{
			Scanner o=new Scanner(System.in);
			int a[]= {0,1,0,2,1,0,1,3,2,1,2,1};
			System.out.print(waterunit(a));
		}
		public static int waterunit(int[] a)
		{
			int res=0;
		for(int j=1;j<a.length-1;j++)
		{
		   int left=a[j];
			for(int i=0;i<j;i++)
				left=Math.max(left, a[i]);
			int right=a[j];
			for(int i=j+1;i<a.length;i++)
				right=Math.max(right, a[i]);
			
			int w=Math.min(left, right);
			int tap=w-a[j];
			res=res+tap;
			
			
			
		}

		return res;
		
		}
}