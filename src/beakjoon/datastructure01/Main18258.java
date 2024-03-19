package beakjoon.datastructure01;

import java.io.*;
import java.util.*;

public class Main18258 {
// push X: 정수 X를 큐에 넣는 연산이다.
// pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// size: 큐에 들어있는 정수의 개수를 출력한다.
// empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
// front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

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
