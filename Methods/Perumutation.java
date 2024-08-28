
package sample;
import java.util.*;
import  java.lang.*;
import java.io.*;
//push 0 1 2  Order 
public class Main {
	int value;
	static ArrayList<String>arr=new ArrayList<String>();
	public  void perumute(String s,int l,int r)
	{
		String str="";
		if(l==r)
		{
		  arr.add(s);	
		}
		for(int i=l;i<=r;i++)
		{
			s=swap(s,l,i);
			perumute(s,l+1,r);
		    s=	swap(s,l,i);
		}
	}
	public static String swap(String s,int i,int j)
	{
		char c[]=s.toCharArray();
		char temp=c[i];
		c[i]=c[j];
		c[j]=temp;
		String str=new String(c);
		
		return str;
		
	}
	public static void main(String[]args)
	{
		String s="1234";
		int n=s.length();
		Main obj=new Main();
		
	    for(int i=0;i<arr.size();i++)
	    {
	    	
	    	System.out.println(arr.get(i));
	    }
	}
	
	
}

	
	