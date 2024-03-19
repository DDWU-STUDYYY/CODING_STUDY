package brute_force.SJ;

// 순열?
import java.util.*;

class Solution_피로도 {

  boolean[] visited;
  int[][] bucket;
  int maxCnt = Integer.MIN_VALUE;

  private void permutation(int[][] dungeons, int idx, int r, int start) {
    if (idx == r) {
      check(start);
    }

    for (int i = 0; i < dungeons.length; i++) {
      if (!visited[i]) {
        visited[i] = true;
        bucket[idx][0] = dungeons[i][0];
        bucket[idx][1] = dungeons[i][1];
        permutation(dungeons, idx + 1, r, start);
        visited[i] = false;
      }
    }
  }

  public void check(int start) {
    int cnt = 0;

    for(int i = 0; i < bucket.length; i++) {
      if (bucket[i][0] <= start){
        start -= bucket[i][1];
        cnt++;
        maxCnt = Math.max(cnt, maxCnt);
      }
      else {
        return;
      }
    }
  }

  public int solution(int k, int[][] dungeons) {

    visited = new boolean[dungeons.length];
    bucket = new int[dungeons.length][2];
    permutation(dungeons, 0, dungeons.length, k);

    return maxCnt;
  }
}
