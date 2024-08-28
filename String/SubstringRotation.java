package helloworld;
import java.util.*;
public class HelloWorld {

	
public static void main(String[] args) {
	
Scanner o=new Scanner(System.in);
System.out.print("enter string:");
String s =o.nextLine();
int l=s.length();
System.out.print("how many time rot:");
int t=o.nextInt();
System.out.println("left:1");
System.out.println("right:2");
int v=o.nextInt();
if(v==1)
{
String sub=s.substring(t);
String sub2=s.substring(0,t);
System.out.print(sub+sub2);
}
else if(v==2)
{
String sub=s.substring(l-t)	;//lo
String sub2=s.substring(0,t+1);//helo
System.out.print(sub+sub2);
}
}}
