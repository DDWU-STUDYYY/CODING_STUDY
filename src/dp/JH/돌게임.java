package dp.JH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 돌게임 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        boolean[] dp = new boolean[n+1];

        dp[1] = true;
        if(n>1){
            dp[2] = false;
        }

        for(int i=3; i<=n; i++){
            dp[i] = !dp[i-1];
        }

        if(dp[n])
            System.out.println("SK");
        else
            System.out.println("CY");
    }
}
