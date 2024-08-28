public class Main {
public static void main(String[]args)
{
int n=6;
int power=2;
System.out.print(Math.pow(n, power));
//OR
int mul=1;
for(int i=0;i<power;i++)
	mul=n*mul;
System.out.print("\n"+mul);
}
}