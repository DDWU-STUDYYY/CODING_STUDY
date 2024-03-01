### DFS

* 스백을 사용해야 합니다. 
* 스택을 사용하지 않고 단순하게 재귀함수만 사용해도 가능하기는 하다. 

1. 스택의 최상단 노드를 확인한다. (마지막에 들어온 노드 체크 )
2. 그 노드의 방문하지 않은 인접 노드가 있으면 그 노드를 스택에 넣고 방문처리 한다. 
3. 방문하지 않은 인접 노드가 없으면 스택에서 최상단 노드를 뽑는다. 


```markdown
 public class 노드방문 {
    static int N,E; // N 은 노드의 수이고 E 는 간선의 수이다. 
    static int [][] Graph;
    static boolean[] visited;

   static void dfa(int node) {
     visitied[node] = true;
     System.out.println(node +" ");
  
     for(int next= 0; next < N; next++){
       if(!visitied[next] && Graph[node][next] != 0){
           dfs(next);
}
}
}
```