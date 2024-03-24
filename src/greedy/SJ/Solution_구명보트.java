package greedy.SJ;

import java.util.Arrays;

public class Solution_구명보트 {
  public int solution(int[] people, int limit) {
    int answer = 0;

    Arrays.sort(people);

    int idx = people.length - 1;
    int start = 0;

    while (idx >= start) {
      if (people[start] + people[idx--] <= limit){
        start++;
      }
      answer++;
    }
    return answer;
  }
}
