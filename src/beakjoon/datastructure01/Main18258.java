package beakjoon.datastructure01;

import java.io.*;
import java.util.*;

public class Main18258 {

  public static void main(String[] args) throws Exception {


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Queue<Integer> queue = new LinkedList<>();

    int n = Integer.parseInt(br.readLine());
    int last = -1;
    for(int i = 0 ; i < n; i++) {

      StringTokenizer st = new  StringTokenizer(br.readLine());
      String cmd = st.nextToken();

      switch(cmd){
        case "push":
          int pushNum = Integer.parseInt(st.nextToken());
          last = pushNum;
          queue.add(pushNum);
          break;
        case "pop" :
          if(!queue.isEmpty()) {
            bw.write(Integer.toString(queue.poll())+"\n");
          }else {
            bw.write(Integer.toString(-1)+"\n");
          }
          break;
        case "size" :
          bw.write(Integer.toString(queue.size())+"\n");
          break;
        case "empty" :
          if(!queue.isEmpty()) {
            bw.write(Integer.toString(0)+"\n");
          }else {
            bw.write(Integer.toString(1)+"\n");
          }
          break;
        case "front" :
          if(!queue.isEmpty()) {
            bw.write(Integer.toString(queue.peek())+"\n");

          }else {
            bw.write(Integer.toString(-1)+"\n");
          }
          break;
        case "back" :
          if(!queue.isEmpty()) {
            bw.write(Integer.toString(last)+"\n");

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
