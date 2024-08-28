package helloworld;
import java.util.*;
public class HelloWorld {
public static void main(String[] args) {
Scanner o=new Scanner(System.in);	
//int n=o.nextInt();
int n=10;
for(int i=1;i<n;i++)
{
	for(int j=i;j<=n;j++)
		System.out.print("  ");
	for(int j=1;j<=i;j++)
		System.out.print("* ");
	for(int j=1;j<i;j++)
		System.out.print("* ");
	
	System.out.println();
		
}
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=i;j++)
		System.out.print("  ");
	for(int j=i;j<=n;j++)
		System.out.print("* ");
	for(int j=i;j<n;j++)
		System.out.print("* ");
	System.out.println();
}

}}
