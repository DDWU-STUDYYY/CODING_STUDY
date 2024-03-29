package dfs_bfs.JH.백준;

import java.util.*;
class 네트워크 {
    static boolean[] visited;
    static ArrayList<Integer>[] arr;
    public int solution(int n, int[][] computers) {
        visited = new boolean[n+1];
        arr = new ArrayList[n+1];
        
        for(int i=1; i<=n; i++){
            arr[i] = new ArrayList<Integer>();
        }
        
        for(int i=0; i<computers.length; i++){
            for(int j=0; j<computers[i].length; j++){
                if(computers[i][j] == 1){
                    arr[i+1].add(j+1);
                    arr[j+1].add(i+1);
                }
            }
        }
        int answer =0;
        
        for(int i=1; i<=n; i++){
            if(!visited[i]){
                dfs(i);
                answer++;
            }
        }
        return answer;
    }
    
    public static void dfs(int a){
        visited[a] = true;
        for(int i : arr[a]){
            if(!visited[i])
              dfs(i);
        }
    }
}