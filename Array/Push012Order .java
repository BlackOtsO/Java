//push 0 1 2  Order 
public class Main {

	public static void main(String[]args)
	{
		int a[]= {1,2,0,0,2,1,1,1,2,0,0,2,1,1,2,2,0};
		int z,t,o;
		z=t=o=0;
		for(int i=0;i<a.length;i++)
			if(a[i]==0)
				z++;
			else if(a[i]==1)
				o++;
			else
				t++;
				
		int s0=0;
		int s1=z;
		int s2=z+o;
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				b[s0]=0;
				s0++;
			}
			else if(a[i]==1)
			{
				b[s1]=1;
				s1++;
			}
			else if(a[i]==2)
			{
				b[s2]=2;
				s2++;
			}
				
		}
		 System.out.print(Arrays.toString(b));
		}
		
		
	
}