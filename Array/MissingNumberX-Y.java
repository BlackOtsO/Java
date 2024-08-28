//missing  number between x-y 
public class Main {

	public static void main(String[]args)
	{
		int a[]= {102,104,114,112,110,108,124};
		Arrays.sort(a);
		int min=a[0];
		int max=a[a.length-1];
		int total=max-min+1;
		//int b[]=new int[total];
		int t=0;
		for(int i=0;i<total;i++)
		{
			if(a[t]!=min)
				System.out.print(min+" ");
			else
			{
				System.out.print("\""+a[t]+"\" ");
				t++;
			}
			min++;
		}
	}
	
}