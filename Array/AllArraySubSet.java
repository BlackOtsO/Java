
package sample;
import java.util.*;
import  java.lang.*;
import java.io.*;
//push 0 1 2  Order 
public class Main {
public static void main(String[]args)
{ int a[]= {1,2,3,4,5,6,7};
subset(a);
int i=2;
int j=3;
//System.out.println(Integer.toBinaryString(i));
//System.out.println(Integer.toBinaryString(j));
//System.out.println(i&j);

}
public static void subset(int []a)
{
	int n=a.length;
    for(int i=0;i<(1<<n);i++)
    {
    	for(int j=0;j<n;j++)
    	{
    		System.out.print(i+"&(1<<"+j+")="+((i&(1<<j)))+"  ");
    		//if((i&(1<<j))!=0)
    			//System.out.print(a[j]);
    	}
    	System.out.println();
    }
}
}