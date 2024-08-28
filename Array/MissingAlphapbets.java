package pack;
import java.util.*;
public class testing {
	
	public static void main(String[]args)
	{
		int flag=0;
		char ap='a';
		String str="";
		Scanner o=new Scanner(System.in);
		String s1=o.nextLine();
		if(s1.length()<26)
		{
			System.out.println("-1n");
		}
		else
		{
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
		if(flag!=1)
			{
				
			
			if(Character.isAlphabetic(c[i]))
			{
				str=str+c[i];
				ap++;
			}
			else if(c[i]=='?')
			{
				str=str+ap;
				ap++;
			}
			}
		else
		{
			str=str+'a';
			
		}
		if(c[i]=='z' )
			flag=1;
			
			
		}
		
		String str2="abcdefghijklmnopqrstuvwxyz";
		char ch[]=str.toCharArray();
		int temp=0;
		for(int i=0;i<26;i++)
		if(str2.contains(Character.toString(ch[i])))
		temp++;	
			
		if(temp==26)
		System.out.print(str);
		else
			System.out.print("-1");
			
		}
		
					
					
			
		}
		
	}
