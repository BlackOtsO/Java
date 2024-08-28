//linear search
public class Main {

	public static void main(String[]args)
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
	System.out.print(linearSearch(a,3));
		
	}
	static int linearSearch(int []a,int value)
	{
		int t=4;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==value)
				return i;
			
		}
		return -1;
	}
}