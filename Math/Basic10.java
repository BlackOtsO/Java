package pack;
import java.util.*;
public class testing {
	public static void  main(String[]args)
	{
		System.out.println("ENTER YOUR OPTION");	
		System.out.println("1. evenodd");
		System.out.println("2. lastdigit");
		System.out.println("3.countdigit");
		System.out.println("4. reverse");
		System.out.println("5. power");
		System.out.println("6.alldivisor");
		System.out.println("7.primenumber");
		System.out.println("8. armstrong");
		System.out.println("9. palindrome");
		System.out.println("10.squareroot");
		System.out.println("11. prefectNUmber");
		
		Scanner o=new Scanner(System.in);
		int option=o.nextInt();
		System.out.println("ENTER VALUE:");
		int value=o.nextInt();
	    switch(option)
	    {
	    case 1:
	    evenodd(value);
	    break;
	    case 2:
	    	lastdigit(value);
	    	break;
	    case 3:
	    	countdigit(value);
	    	break;
	    case 4:
	    	reverse(value);
	    	break;
	    case 5:
	    	power(value);
	    	break;
	    case 6:
	    	alldivisor(value);
	    	break;
	    case 7:
	    	primenumber(value);
	    	break;
	    case 8:
	    	armstrong(value);
	    	break;
	    case 9:
	    	palindrome(value);
	    break;
	    case 10:
	    	squareroot(value);
	    	break;
	    case 11:
	    	perfectNumber(value);
	    	break;
	    	
	    }
	    }
	    public static void evenodd(int n)
	    {
	    	if(n%2==0)
	    		System.out.print("Number is Even");
	    	else
	    		System.out.print("Number is Odd");
	    }
	    public static void lastdigit(int n)
	    {
	    
	    	System.out.print("Last Digit is:"+(n%10));
	    	
	    }
	    public static void countdigit(int n)
	    {
	    	int t=0;
	    	while(n!=0)
	    	{
	    		
	    	n=n/10;
	    	t++;
	    	}
	    	System.out.print("Count is :"+t);
	    }
	    public static void reverse(int n)
	    {
	    	int temp=0;
	    	int t=0;
	    	while(n!=0)
	    	{
	    		t=n%10;
	    		temp=(temp*10)+t;
	    		n=n/10;
	    	}
	    	System.out.print("Reverse Number is: "+temp);
	    }
	    public static void power(int n)
	    {
	    	System.out.print("power of the Number:"+(n*n));
	    }
	    public static void alldivisor(int n)
	    {
	    	for(int i=1;i<=n;i++)
	    	{
	    		if(n%i==0)
	    			System.out.println(i);
	    	}
	    }
	    public static void primenumber(int n)
	    {
	    	int t=0;
	    	for(int i=2;i<=n;i++)
	    	{
	    		
	    		if(n%i==0)
	    			t++;
	    	}
	    	if(t==1)
	    		System.out.print(n+" Number is prime Number");
	    }
	    public static void armstrong(int n)
	    {
	    	int sum=0;
	    	int temp=n;
	    	while(n!=0)
	    	{
	    		sum=n%10;
	    		n=n/10;
	    		
	    	}
	    	if(temp==sum)
	    		System.out.print("Number is amstrong"+n);
	    	else
	    		System.out.print("Number is Not amstrong Number"+n);
	    		
	    }
	    public static void palindrome(int n)
	    {
	    	int rev=n;
	    	int temp=0;
	    	int t=0;
	    	while(n!=0)
	    	{
	    		t=n%10;
	    		temp=(temp*10)+t;
	    		n=n/10;
	    	}
	    	if(rev==temp)
	    		System.out.print("Number is palidrome");
	    	else
	    		System.out.print("Number is Not palidrome");
	    }
	    public static void squareroot(int n)
	    {
	    	System.out.print("Undefined");
	    }
	    public static  void perfectNumber(int n)
	    {
	    	for(int i=1;i<=n;i++)
	    	{
	    		int t=0;
	    		if(n%i==0)
	    			t=t+i;
	    		
	    	}
	    	if(t==n)
	    		System.out.print("prefect Number");
	    }
	
	
	
}