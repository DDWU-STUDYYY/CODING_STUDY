package dp.JH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수5 {

    static int d[] = new int[100];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        System.out.println(fibo(n));
    }


    public static int fibo(int num) {

      d[0] = 0;
      d[1] = 1;

      for(int i=2; i<=num; i++){
          d[i] = d[i-1] + d[i-2];
      }

      return d[num];
    }

}
