package 자율인증.SJ;

import java.util.Arrays;

public class Solution_최솟값과최댓값 {
  public String solution(String s) {

    int[] nums = Arrays.stream(s.split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

    Arrays.sort(nums);

    return nums[0]+ " " +nums[nums.length - 1];
  }

}
