import java.util.*;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		int n = cin.nextInt();
		int[][] dp = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				dp[i][j] = cin.nextInt();
			}
		}
		
		//处理第一行
		for(int i = 1; i < n; i++) {
			dp[0][i] += dp[0][i-1];
		}
		//first col
		for(int i = 1; i < m; i++) {
			dp[i][0] += dp[i-1][0];
		}
		
		for(int i = 1; i < m; i++) {
			for(int j = 1; j < n; j++) {
				dp[i][j] += Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		
		System.out.println(dp[m-1][n-1]);
	}

}
