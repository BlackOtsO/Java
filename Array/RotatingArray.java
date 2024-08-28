package pack;
import java.util.*;
public class testing {
	
	
	
	public static void main(String[]args)
	{
		int k=2;
		int a[]= {1,2,3,4,5,6};
		int b[]= {1,2,3,4,5,6};
		System.out.println("Right ro");
		for(int i=0;i<k;i++)
		{
			int temp=a[0];
			for(int j=1;j<a.length;j++)
			{
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
			
			int temp2=b[b.length-1];
			for(int j=b.length-2;j>=0;j--)
			{
				b[j+1]=b[j];
			}
			b[0]=temp2;
				
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
	
		
	}
