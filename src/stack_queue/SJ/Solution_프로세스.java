package stack_queue.SJ;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution_프로세스 {
  public int solution(int[] priorities, int location) {

    PriorityQueue<Integer> qu = new PriorityQueue<>(Collections.reverseOrder());

    for (int i : priorities) {
      qu.offer(i);
    }

    int order = 0;
    while(!qu.isEmpty()){

      for (int i = 0; i < priorities.length; i++) {
        if (qu.peek() == priorities[i]){
          qu.poll(); //꺼낸다.
          order++;

          if (i == location) {
            return order;
          }
        }
      }

    }

    return 0;
  }

}
