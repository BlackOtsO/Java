for(int i=0;i<limit;i++)
{
  int temp=a[n-1];
  for(int j=n-2;j>=0;j--)
    {
      a[i+1]=a[i];
     }
   a[0]=temp;
}