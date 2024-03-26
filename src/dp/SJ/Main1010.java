package dp.SJ;

import java.io.*;
import java.util.*;

public class Main1010 {


  public static void combin(int[][] C) {

    for (int i = 0; i < 30; i++) {
      C[i][0] = 1;
      C[i][i] = 1;
    }
    for (int i = 2; i < 30; i++) {
      for(int j = 1; j < 30; j++){
        C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
      }
    }
  }

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int[][] C = new int[30][30];
    combin(C);

    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());

      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      bw.write(String.valueOf(C[m][n])+"\n");

    }


    br.close();
    bw.flush();
    bw.close();
  }
}

