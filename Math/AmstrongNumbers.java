/*153:true
370:true
371:true
407:true
1634:true
8208:true
9474:true
54748:true
92727:true
93084:true
548834:true
1741725:true
4210818:true
9800817:true
9926315:true
24678050:true
24678051:true
88593477:true
146511208:true
472335975:true
534494836:true
912985153:true
*/
public static void AmstrongNumber(int n) {
	
int len=countdigit(n);

	int n1=n;
	int total=0;
	while(n1!=0)
	{
		int rem=n1%10;
		int sum=1;
		for(int i=0;i<len;i++)
		{
			sum=sum*rem;
		}
		total=total+sum;
		n1=n1/10;
		
		
	}
	if(n==total)
	System.out.println(n+":true");
	
}
	public static int countdigit(int n)
	{
		int t=0;
		while(n!=0)
		{
			n=n/10;
			t++;
		}
		return t;
		
	}
	
}
