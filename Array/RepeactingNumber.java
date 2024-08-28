//repeacting number
public class Main {

	public static void main(String[]args)
	{
		int a[]= {1,2,3,3,4,5,6,7,8,9,3,5,7};
		ArrayList<Integer>arrlist=new ArrayList<Integer>();
	arrlist=repeactNumber(a);
	System.out.print(arrlist);
		
	}
	static ArrayList<Integer> repeactNumber(int a[])
	{
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		for(int i=0;i<a.length-1;i++)
		{
			boolean flag=false;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && a[j]!=-1)
				{
					flag=true;
					a[j]=-1;
				}
			}
				if(flag)
					arrlist.add(a[i]);
					
		}
		int b[]=new int[arrlist.size()];
//		for(int i=0;i<arrlist.size();i++)
//			b[i]=arrlist.get(i);
	
		return arrlist;
		
	}
}