package dp.SJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main9655 {

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    if (N % 2 == 0){
      bw.write("CY");

    }else {
      bw.write("SK");
    }

    br.close();
    bw.flush();
    bw.close();
  }

}
