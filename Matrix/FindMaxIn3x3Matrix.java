//find max in 3x3 in matrix
class Solution {
   
  public static int getmax(int matrix[][],int start,int startcolumn)
        {
            int max=0;
          int  r=start+3;
          int  c=startcolumn+3;
            for(int i=start;i<r;i++)
            {
                for(int j=startcolumn;j<c;j++)
                {
                    max=Math.max(matrix[i][j],max);
                }
            }
            return max;
        }
         public int[][] largestLocal(int[][] grid) {
        int r=grid.length-2;
        int c=grid[0].length-2;
        int a[][]=new int [r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=getmax(grid,i,j);
            }
        }
        return a;
    }}