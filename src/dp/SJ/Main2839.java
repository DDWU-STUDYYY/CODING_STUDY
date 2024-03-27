package dp.SJ;

import java.io.*;

public class Main2839 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine()); // 5000까지

    System.out.println(dp(N));
  }

  // dp 버전
  public static int dp (int N) {
    int[] dp = new int[5001];

    int INF = 50000;

    for (int i = 1; i < dp.length; i++) {
      dp[i] = INF;
    }

    dp[3] = 1;

    for(int i = 5; i <= 5000; i++) {
      dp[i] = Math.min(Math.min(dp[i], dp[i - 3] + 1), dp[i - 5] + 1);
    }

    dp[N] = (dp[N] == INF) ? -1 : dp[N];

    return dp[N];
  }

  // dp 아닌 버전
  public static int calc(int N) {
    int cnt = 0;

    while (N > 0) {

      if (N % 5 == 0) {
        return cnt + N / 5;
      } else {
        if (N < 3) {
          return -1;
        } else {
          N -= 3;
          cnt++;
        }
      }
    }
    return cnt;
  }
}

