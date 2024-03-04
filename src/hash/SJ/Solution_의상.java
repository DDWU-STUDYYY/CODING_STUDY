package hash.SJ;

import java.util.HashMap;

public class Solution_의상 {

    public int solution(String[][] clothes) {
      int answer = 1;

      HashMap<String, Integer> hm = new HashMap<>();

      for (int i = 0; i < clothes.length; i++) {
        hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0) + 1);
      }

      for (String i : hm.keySet()) {
        answer *= (hm.get(i) + 1);
      }

      return answer - 1;
    }

}
