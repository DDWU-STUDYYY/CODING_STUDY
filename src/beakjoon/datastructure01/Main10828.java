package beakjoon.datastructure01;

import java.io.*;
import java.util.*;

public class Main10828 {

  public static void main(String[] args) throws Exception {


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Stack<Integer> stack = new Stack<>();

    int n = Integer.parseInt(br.readLine());

    for(int i = 0 ; i < n; i++) {

      StringTokenizer st = new  StringTokenizer(br.readLine());
      String cmd = st.nextToken();

      switch(cmd){
        case "push":
          int pushNum = Integer.parseInt(st.nextToken());
          stack.push(pushNum);
          break;
        case "pop" :
          if(!stack.isEmpty()) {
            bw.write(Integer.toString(stack.pop())+"\n");
          }else {
            bw.write(Integer.toString(-1)+"\n");
          }
          break;
        case "size" :
          bw.write(Integer.toString(stack.size())+"\n");
          break;
        case "empty" :
          if(!stack.isEmpty()) {
            bw.write(Integer.toString(0)+"\n");
          }else {
            bw.write(Integer.toString(1)+"\n");
          }
          break;
        case "top" :
          if(!stack.isEmpty()) {
            bw.write(Integer.toString(stack.peek())+"\n");

          }else {
            bw.write(Integer.toString(-1)+"\n");
          }
          break;
      }

    }
    bw.close();
    br.close();
  }
}
