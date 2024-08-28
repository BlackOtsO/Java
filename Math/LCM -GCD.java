package pack;
import java.util.*;
public class testing {
	public static void main(String[]args)
	{
		LCM(12,26);
	GCD(12,26);
	
	}
	public static void LCM(int n1,int n2)
	{
		int lcm=0;
		if(n1>n2)
			lcm=n1;
		else if(n2>n1)
			lcm=n2;
		int t=0;
		while(true)
		{
			if(lcm%n1==0 && lcm%n2==0)
			{
	         System.out.println(lcm);
	         break;
			}
			lcm++;
		}
		
	}
	public static int  GCD(int n1,int n2)
	{
		int t=0;
		for(int i=1;i<=n1 && i<=n2;i++)
			if(n1%i==0 && n2%i==0)
			{
				t=i;
				
				
			}
		System.out.println(t);
		 return t;
	}
	
}
	