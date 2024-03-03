package stack_queue.SJ;

import java.util.*;

public class Solution_같숫싫 {
  public int[] solution(int []arr) {

    List<Integer> nums = new ArrayList<Integer>();

    for (int n : arr) {
      if (nums.isEmpty() || !nums.get(nums.size() - 1).equals(n)) {
        nums.add(n);
      }
    }

    return nums.stream().mapToInt(i -> i).toArray();

  }
}