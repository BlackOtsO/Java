package helloworld;
import java.util.*;
public class HelloWorld {

public static void spp(int a[][],int rend,int cend )
{
	int r=rend;
	int c=cend;
	int rs=0,cs=0,t=0;
	int b[]=new int[rend*cend];
 while(rs<rend && cs<cend)
 {
	 for(int i=cs;i<cend;i++)
	 {
		b[t]= a[rs][i];
		t++;
	 }
	 rs++;
	 for(int i=rs;i<rend;i++)
	 {
		b[t]=a[i][cend-1];
		t++;
	 }
	 cend--;
	 if(rs<rend)
	 {
	 for(int i=cend-1;i>=cs;i--)
	 {
		 b[t]=a[rend-1][i];
		 t++;
	 }
	 rend--;
	 }
	 if(cs<cend)
	 {
		 for(int i=rend-1;i>=rs;i--)
		 {
			 b[t]=a[i][cs];
			 t++;
		 }
		 cs++;
	 }
 }
  int t2=0;
  for(int i=0;i<r;i++)
  {
	  for(int j=0;j<c;j++)
	  {
		System.out.printf(b[t2]+" ");
		t2++;
	  }
     System.out.println();
  }
  
  
  
  
}
		
	
		public static void main(String[] args)
		{
			Scanner o=new Scanner(System.in);
			int r=o.nextInt();
			int c=o.nextInt();
		int	a[][]=new int[r][c];
            for(int i=0;i<r;i++)
            	for(int j=0;j<c;j++)
            		a[i][j]=o.nextInt();
			spp(a,r,c);
		}
	


}   