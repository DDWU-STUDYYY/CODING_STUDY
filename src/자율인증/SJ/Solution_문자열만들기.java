package 자율인증.SJ;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution_문자열만들기 {

  public int solution(int []A, int []B)
  {
    int answer = 0;

    PriorityQueue<Integer> a = new PriorityQueue<>();
    PriorityQueue<Integer> b = new PriorityQueue<>(Comparator.reverseOrder());

    for(int i = 0; i < A.length; i++) {
      a.offer(A[i]);
      b.offer(B[i]);
    }

    //
    while (!a.isEmpty()) {
      answer += (a.poll() * b.poll());
    }

    return answer;
  }
}
