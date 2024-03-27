package dp.SJ;

import java.io.*;

public class Main17626 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
     System.out.println(dp(N));
  }

  public static int dp (int N) {
    int[] dp = new int[50001];

    int INF = 500001;

    dp[0] = 0;
    dp[1] = 1;

    for (int i = 2; i <= N; i++) {
      double min_value = INF;
      for (int k = 1; k * k <= i; k++) {
        min_value = Math.min(min_value, dp[i - k * k]);
      }
      dp[i] = (int)min_value + 1;
    }

    return dp[N];
  }
}
