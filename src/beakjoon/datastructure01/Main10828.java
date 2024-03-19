package beakjoon.datastructure01;

import java.io.*;
import java.util.*;

public class Main10828 {
  // push X: 정수 X를 스택에 넣는 연산이다.
// pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// size: 스택에 들어있는 정수의 개수를 출력한다.
// empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
// top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

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
