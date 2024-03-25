package dp.SJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2748 {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    long[] F = new long[91];

    F[1] = 1;
    F[2] = 1;

    for (int i = 3; i <= N; i++) {
      F[i] = F[i - 2] + F[i - 1];
    }

    bw.write(String.valueOf(F[N]));

    br.close();
    bw.flush();
    bw.close();
  }
}
