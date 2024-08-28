package sample;
import java.util.*;
import  java.lang.*;
import java.io.*;
public class Main {
public static void main(String[]args)
{
	Scanner o=new Scanner(System.in);
String s1=o.next();
String s2=o.next();
String ans="";
int n=0;
for(int i=0;i<s1.length();i++)
{
	String sub=s1.substring(i);
	if(s2.contains(sub))
	{
		ans=sub;
		n=i+1;
	break;
	}
}
s2=s2.replace(ans,"");
s1=s1.replace(ans, "");
int l=s1.length();
int l2=s2.length();
System.out.print(l+l2);



}
}