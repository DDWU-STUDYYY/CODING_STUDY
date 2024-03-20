package brute_force.SJ;

import java.util.*;

public class Solution_전력망 {

  static boolean[] visted;
  static int min = Integer.MAX_VALUE;
  static int cnt = 1;

  // 넓이 우선 탐색으로 품..
  public static void bfs(int idx, List<Integer>[] bucket) {

    visted[idx] = true;

    for(Integer i : bucket[idx]) {

      if (!visted[i]) {
        cnt++;
        visted[i] = true;
        bfs(i, bucket);
      }
    }

  }

  public static int solution(int n, int[][] wires) {

    int answer = -1;

    List<Integer>[] bucket = new ArrayList[n + 1];


    for (int i = 1; i < n + 1; i++) {
      bucket[i] = new ArrayList<Integer>();
    }

    for(int i = 0; i < wires.length; i++) {
      bucket[wires[i][0]].add(wires[i][1]);
      bucket[wires[i][1]].add(wires[i][0]);
    }

    // 각 간선에서 계산..~ 셀때 연결 bucket에서 삭제하고 cnt해주기 -> 복구해줘야함.
    for (int i = 0; i < wires.length; i++) {
      visted = new boolean[n + 1];
      cnt = 1;
      int n1 = wires[i][0];
      int n2 = wires[i][1];

      visted[n2] = true;

      bfs(n1, bucket);

      min = Math.min(Math.abs(n - (2 * cnt)), min);
      visted[n2] = false;
    }

    return min;
  }
}
