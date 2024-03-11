package heap.SJ;

import java.util.*;

public class Solution_더맵게 {
    public int solution(int[] scoville, int K) {
      // 우선 작은 순으로 정렬
      PriorityQueue<Integer> pQ = new PriorityQueue<>();
      int cnt = 0;

      // 넣기
      for (int i : scoville) {
        pQ.add(i);
      }

      while (pQ.peek() < K) {

        if (pQ.size() == 1) {
          return -1;
        }

        pQ.add(pQ.poll() + pQ.poll() * 2);
        cnt++;
      }
      return cnt;

    }
}
