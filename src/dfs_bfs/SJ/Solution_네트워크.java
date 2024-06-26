package dfs_bfs.SJ;

public class Solution_네트워크 {

  boolean[] visited;

  public void dfs(int[][] computers, int idx) {

    visited[idx] = true;

    for (int i = 0; i < computers.length; i++) {
      if ((!visited[i]) && computers[idx][i] == 1){
        dfs(computers, i);
      }
    }
  }


  public int solution(int n, int[][] computers) {
    int answer = 0;

    visited = new boolean[n];

    for (int i = 0; i < n; i++) {
      if (!visited[i]){
        dfs(computers, i);
        answer++;
      }
    }

    return answer;
  }
}
