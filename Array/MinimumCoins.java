package helloworld;
import java.util.*;
public class HelloWorld {

	    static int minCoins(int[] coins, int target) {
	        int[] dp = new int[target + 1];
	        Arrays.fill(dp, Integer.MAX_VALUE);
	        dp[0] = 0;

	        for (int coin : coins) {
	            for (int i = coin; i <= target; i++) {
	                if (dp[i - coin] != Integer.MAX_VALUE) {
	                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
	                }
	            }
	        }

	        return dp[target] == Integer.MAX_VALUE ? -1 : dp[target];
	    }
	
public static void main(String[] args) {
	

    int[] coins = {1, 5, 10, 25};
   Scanner o=new Scanner(System.in);
   int n=o.nextInt();
   int v[]=new int[n];
   int r[]=new int[n];
   for(int i=0;i<n;i++)
	   v[i]=o.nextInt();
for(int i=0;i<n;i++)
{
    r[i]= minCoins(coins,v[i] );
    System.out.print(r[i]);
}

}}
