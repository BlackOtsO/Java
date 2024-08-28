//largest three
public class Main {
public static void main(String[]args)
{
int a[]= {234,123,4,2,1,3,5,6,89,93,1222,32435,245,324};
int first,second,third;
first=second=third=0;
for(int i=0;i<a.length;i++)
{
  if( a[i]>first)
  {
	  third=second;
	 second=first;
	  first=a[i];
  }
  else if(a[i]>second)
   {
	  third=second;
	   second=a[i];
   }
  else if(a[i]>third)
	  third=a[i];
}
System.out.print(third);

}
}