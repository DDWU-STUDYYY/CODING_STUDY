package dfs_bfs.JH.백준;

import java.util.*;

class 게임맵최단거리 {
    
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    
    static int[][] visited;
    
    public int solution(int[][] maps) {
        
        int n = maps.length; // 행의 길이
        int m = maps[0].length; // 열의 길이
        
        visited = new int[n][m]; // 행과 열 길이로 설정
        
        // visited 배열 초기화
        for (int i = 0; i < n; i++) {
            Arrays.fill(visited[i], 0);
        }
        
        bfs(0, 0, maps, n, m);
        
        if (visited[n - 1][m - 1] == 0)
            return -1;
        else 
            return visited[n - 1][m - 1];
    }
    
    public static void bfs(int x, int y, int[][] maps, int n, int m) {
        
        Queue<int[]> queue = new LinkedList<>();
        
        visited[x][y] = 1;
        
        queue.add(new int[] {x, y});
        
        while (!queue.isEmpty()) {
            int[] ak = queue.poll();
            int a = ak[0];
            int b = ak[1];
            
            for (int i = 0; i < 4; i++) {
                int xx = a + dx[i];
                int yy = b + dy[i];
                
                if (xx < 0 || yy < 0 || xx >= n || yy >= m)
                    continue;
                
                if (maps[xx][yy] == 0 || visited[xx][yy] != 0)
                    continue;
                
                visited[xx][yy] = visited[a][b] + 1;
                queue.add(new int[]{xx, yy});
            }
        }
    }
}