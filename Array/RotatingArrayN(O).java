package helloworld;
import java.util.*;
public class HelloWorld {
   
public static void rev(int b[],int i,int j)
{
	for(int k=i;k<j;k++)
	{
	int t=b[i];
	b[i]=b[j];
	b[j]=t;
	i++;
	j--;
//	System.out.print(i+" "+j);
	}
}
public static void main(String[] args) {
	Scanner o=new Scanner(System.in);
		int b[]={1,2,3,4,5,6,7,8};
		int start=0;
		int end=b.length;
		System.out.print("how many times rotation happen");
		int lim=o.nextInt();
		lim=lim%10;
		if(lim<0)
			lim=
		rev(b,start,lim-1);
		rev(b,lim,end-1);
		rev(b,start ,end-1);
		
		for(int i=0;i<end;i++)
	System.out.print(b[i]+" ");
}}
