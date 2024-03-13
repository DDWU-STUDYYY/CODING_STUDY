package sort.SJ;

import java.util.Arrays;

public class Solution_가장큰수 {
  public String solution(int[] numbers) {

    String answer = "";
    String[] nums = new String[numbers.length];

    for (int i = 0; i < numbers.length; i++) {
      nums[i] = Integer.toString(numbers[i]);
    }

    // 34, 30, 3이 있으면 34 3 30 이어야 됨....
    // 343보단 3430 이 붙는게 더 작음
    // 두 수를 붙였을 때 큰거 먼저 오도록(문자열 기준)
    // 0은 제외해야...
    Arrays.sort(nums, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

    if (nums[0].equals("0")) { // 000일때
      return "0";
    }

    return String.join("", nums);
  }

}
