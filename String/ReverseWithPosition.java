package helloworld;
import java.util.*;
public class HelloWorld {
public static void main(String[] args) {
	int a[]=new int[4];
	int t=0;
Scanner o=new Scanner(System.in);	
String s=o.nextLine();
StringBuffer sf= new StringBuffer(s );
sf=sf.reverse();
String s2=sf.toString();
s2=s2.replaceAll(" ","");
//System.out.print(s2;
char c[]=s.toCharArray();
for(int i=0;i<s.length();i++)
{
	if(c[i]==' ')
		System.out.print(" ");
	else
	{
		System.out.print(s2.charAt(t));
	t++;
}}
//System.out.print(t);

					
}}