public class Main {
public static void main(String[]args)
{
int n=125;
int n2=175;
for(int i=2;i<=n && i<=n2;i++)
{
	if(n%i==0 && n2%i==0)
	{
	System.out.println(i);
	break;
	}
}
}
}