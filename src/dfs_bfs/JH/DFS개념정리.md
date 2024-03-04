### DFS

1. 깊이 우선 탐색이고 깊은 부분을 우선적으로 탐색하는 알고리즘이다. 
2. 스택을 사용한다. 
3. 탐색 노드를 스택에 삽입하고 방문 처리를 합니다. 
4. 스택의 최상단 노드에 방문하지 않은 인접 노드가 하나라도 있으면 그 노드를 스택에 넣고 
방문 처리합니다. 방문하지 않은 인접 노드가 없으면 스택에서 최상단 노드를 꺼냅니다. 
5. 더 이상 2번의 과정을 수행할 수 없을 때까지 반복합니다. 

* 방문의 기준은 문제에서 요구하는 방식에 따라 달라질 수가 있다. 



```markdown

public static boolean[] visited = new boolean[9];

public static ArrayList<ArrayList<Integer>> graph = new ArrayList<Integer>>();

public static void dfs(int x){ 
  
  visited[x] = true;
  System.out.println(x+" ");
  
  for(int i=0; i<graph.get(x).size(); i++){
     int y = graph.get(x).get(i);
      if(!visited[y]) 
           dfs(y);
}
}

```

### BFS 

1. 시작하는 칸을 큐에 넣고 방문했다는 표시를 남긴다. 
2. 큐에서 원소를 꺼내어 그 칸에 상화좌우로 인접한 칸에 대해 3번을 진행한다. 
3. 해당 칸을 이전에 방문했다면 아무것도 하지 않고, 처음으로 방문했다면 방문했다는 
표시를 남기고 해당 칸을 큐에 삽입한다. 
4. 큐가 빌 때까지 2번을 반복한다. 모든 칸이 큐에 1번씩 들어가므로 시간복잡도가 O(N) 이 된다.


* 밑에 나오는 그냥 코드를 외워버려라 
* 아래의 코드는 최소 거리를 구하는 BFS 의 기본 틀이다 !! 

```markdown

import java.util.*;

class Solution {
    
    static int dx[] = {1,0,-1,0};
    static int dy[] = {0,1,0,-1};
    
    public int solution(int[][] maps) {
        
        int answer = 0;
        
        int[][] visited = new int[maps.length][maps[0].length];
        
        dfs(maps,visited);
        
        answer = visited[maps.length-1][maps[0].length-1];
        
        
        if(answer == 0)
            answer = -1;
        
    return answer;
    }
    
    public void dfs(int[][] maps, int [][] visited){
        
        int  x = 0;
        int y = 0;
        
        visited[x][y] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        
        
        while(!queue.isEmpty()){
            int[] s = queue.remove();
            
            int cx = s[0];
            int cy = s[1];
            
            for(int i=0; i<4; i++){
                int ddx = cx + dx[i];
                int ddy = cy + dy[i];
                
          if(ddx < 0 || ddy < 0 || ddx > maps.length-1 || ddy > maps[0].length-1)
       continue;
                
                if(visited[ddx][ddy]==0 && maps[ddx][ddy] == 1){
                    visited[ddx][ddy] = visited[cx][cy] + 1;
                    queue.add(new int[]{ddx,ddy});
                }
            
                }
        }
        
    }
}
```

* DFS 와 BFS 의 완전 기본 틀 
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.*;

public class Algo1260 {

    static int graph[][];
    static boolean check[];

    static int a ;
    static int b;

    static int count;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

         a = Integer.parseInt(st.nextToken());
         b = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        graph = new int[a+1][a+1];
        check = new boolean[a+1];

        for(int i=0; i<b; i++){
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        dfs(start);
        System.out.println();
        bfs(start);
    }

    public static void dfs(int t){ // stack 사용하지 않고 그냥 재귀로 해준다

        check[t] = true;
        System.out.print(t+" ");

        for(int i=1; i<=a; i++){
            if(!check[i] && graph[t][i] != 0 ){
                dfs(i);
            }
        }
    }

    public static void bfs(int t){
        boolean[] visitied = new boolean[a+1];
        Queue<Integer> q = new LinkedList<>();

        visitied[t] = true;
        q.add(t);

        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+" ");

            for(int i=1; i<=a; i++){
                if(!visitied[i] && graph[curr][i] !=0){
                    visitied[i] = true;
                    q.add(i);
                }
            }
        }
    }
}
/*
```










