public static  void cumulative(int a)
	{
		int sum=0;
	while(sum>9 || a>0 )
	{
		if(a==0)
		{
			a=sum;
			sum=0;
		}
		sum=sum+(a%10);
		a=a/10;
	}
	System.out.print(sum);
		
	}