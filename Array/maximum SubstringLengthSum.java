package helloworld;
import java.util.*;
public class HelloWorld {
public static void main(String[] args) {
Scanner o=new Scanner(System.in);	
//int a[]= {9,0,0,0,1,1,9,8,7,6};
int a[]= {1,4,2,10,23,3,1,0,20};
int k=4,n=9,h=0;;
int t=0;
for(int i=0;i<=n-k;i++)
{
	int l=0;
	for(int j=0+t;j<k+t;j++)
	{
		l=l+a[j];
	}
	if(h<l)
		h=l;
	t++;
	
}
System.out.print(h);
}}