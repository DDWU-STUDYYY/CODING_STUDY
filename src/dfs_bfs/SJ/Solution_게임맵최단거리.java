package dfs_bfs.SJ;

import java.util.*;

public class Solution_게임맵최단거리 {
  int N;
  int M;
  int[][] visited;

  public boolean check(int r, int c) {

    if (r >= 0 && r < N && c >= 0 && c < M){
      return true;
    }
    return false;
  }

  public int dfs(int[][] maps, int r, int c) {
    Queue<int[]> q = new LinkedList<>();

    int[] rArr = {-1, 1, 0, 0 };
    int[] cArr = {0, 0, 1, -1};

    visited[r][c] = 1;
    q.offer(new int[]{r, c});

    while(!q.isEmpty()) {

      int[] temp = q.poll();

      int newRow = temp[0];
      int newColm = temp[1];

      // 상하좌우 체크
      for (int i = 0; i < 4; i++) {

        int nextRow = newRow + rArr[i];
        int nextColm = newColm + cArr[i];

        if (check(nextRow, nextColm)){
          // 방문하지 않았고, 유효한 값인지(1) 체크해야함
          if(visited[nextRow][nextColm] == 0 && maps[nextRow][nextColm] == 1) {
            visited[nextRow][nextColm] = visited[newRow][newColm] + 1;
            q.offer(new int[]{nextRow, nextColm});
          }
        }
      }
    }

    return 0;

  }

  public int solution(int[][] maps) {
    int answer = 0;

    N = maps.length;
    M = maps[0].length;

    visited = new int[N][M];

    dfs(maps, 0, 0);

    return (visited[N - 1][M - 1] == 0) ? -1 : visited[N - 1][M - 1];
  }
}
