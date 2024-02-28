package hash.SJ;

import java.util.*;

public  class Pokemon {
  public int solution(int[] nums) {
    HashSet<Integer> hs = new HashSet<>();

    for (int i = 0; i < nums.length; i++){
      hs.add(nums[i]);
    }

    return Math.min(hs.size(), nums.length / 2);
  }
}
