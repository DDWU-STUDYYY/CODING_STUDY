package hash.SJ;

import java.util.*;

public class Day2 {
  public String solution(String[] participant, String[] completion) {

    HashMap<String, Integer> hm = new HashMap<>();

    for (String name : completion) {
      if (hm.containsKey(name)){
        hm.replace(name, hm.get(name) + 1);
      } else {
        hm.put(name, 1);
      }
    }

    for (String name : participant) {
      int cnt = hm.getOrDefault(name, 0);
      if (cnt == 0){
        return name;
      } else {
        hm.replace(name, cnt - 1);
      }
    }

    return "";

  }
}
