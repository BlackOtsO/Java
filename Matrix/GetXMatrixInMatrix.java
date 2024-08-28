//get x matrix in matrix

package sample;
import java.util.*;
import  java.lang.*;
import java.io.*;
//push 0 1 2  Order 
public class Main {

	public static void getmatrix(int [][]a,int startrow,int startcolumn,int limit)
	{
		int r=startrow+limit;
		int c=startcolumn+limit;
		if(r <=a.length)
		for(int i=startrow;i<r;i++)
		{
			for(int j=startcolumn;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
			
		}
		else
			System.out.print("MATRIX IS LIMITED");
	}
	public static void displaymatrix(int [][]a,int x)
	{
	
		int r=a.length-(x-1);
		int c=a[0].length-(x-1);
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				getmatrix(a,i,j,x);
				System.out.print("\n");
			}
		}
		
	}
	
public static void main(String[]args)
{
	int a[][]= {{1,2,3,4,5,6,7},
			{8,9,10,11,12,13,14},
			{15,16,17,18,19,20,21},
			{22,23,24,25,26,27,28},
			{29,30,31,32,33,34,35},
			{36,37,38,39,40,41,42},
			{43,44,45,46,47,48,49}};
	//for(int i=2;i<5;i++)
	displaymatrix(a,5);
//	matrixcreate(7,7);
}
}