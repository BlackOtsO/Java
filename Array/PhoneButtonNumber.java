package helloworld;
import java.util.*;
public class HelloWorld {	
	
	public static void main(String[] args) {
		char ch='a';
		char c[][]=new char[10][4];
for(int i=2;i<10;i++)
{
	if(i==9 || i==7)
	{
		for(int j=0;j<4;j++)
		{
			c[i][j]=ch;
			ch++;
		}
		
	}
	else
	for(int j=0;j<3;j++)
	{
		c[i][j]=ch;
		ch++;
	}
}
//String s ="sita";
char charr[]=s.toCharArray();
int b[]=new int[charr.length];
for(int k=0;k<charr.length;k++)
{
	for(int i=2;i<10;i++)
	{
		if(i==9 || i==7)
		{
			for(int j=0;j<4;j++)
			{
				if(c[i][j]==charr[k])
					b[k]=i;
				
			}
			
		}
		else
		for(int j=0;j<3;j++)
		{
			if(c[i][j]==charr[k])  
			b[k]=i;
		}
	}
}
for(int i=0;i<charr.length;i++)
	System.out.print(b[i]);
}   }