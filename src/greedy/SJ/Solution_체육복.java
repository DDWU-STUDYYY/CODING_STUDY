package greedy.SJ;

import java.util.*;

public class Solution_체육복 {
  public int solution(int n, int[] lost, int[] reserve) {

    Arrays.sort(lost);
    Arrays.sort(reserve);

    List<Integer> lostList = new ArrayList<>();
    List<Integer> reserveList = new ArrayList<>();
    List<Integer> removeList = new ArrayList<>();

    for (int i : lost) {
      lostList.add(i);
    }

    for (int i : reserve) {
      reserveList.add(i);
    }

    for (int i : reserveList){
      if (lostList.contains(i)){
        removeList.add(i);
      }
    }

    reserveList.removeAll(removeList);
    lostList.removeAll(removeList);

    for(int i : reserveList) {
      if (lostList.contains(i - 1)){
        lostList.remove(Integer.valueOf(i - 1));
      } else if (lostList.contains(i + 1)) {
        lostList.remove(Integer.valueOf(i + 1));
      }

    }

    return n - lostList.size();
  }
}