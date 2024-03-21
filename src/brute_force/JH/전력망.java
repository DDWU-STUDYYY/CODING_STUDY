package brute_force.JH;

class 전력망 {
    
    static int [][] check;
    static boolean visited[];
    static int count = 0;
    
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE; // 최솟값을 찾기 위해 초기값을 무한대로 설정
        
        check = new int[n+1][n+1];
        
        // 전선 연결 상태 표시
        for(int i = 0; i < wires.length; i++) {
            int v1 = wires[i][0];
            int v2 = wires[i][1];
            check[v1][v2] = 1; // 연결된 송전탑을 표시
            check[v2][v1] = 1;
        }
        
        // 하나씩 전선을 끊어주고 각각의 전력망 송전탑 개수를 계산하여 차이의 최솟값을 찾음
        for(int i = 0; i < wires.length; i++) {
            int v1 = wires[i][0];
            int v2 = wires[i][1];
            
            // 전선 끊기
            check[v1][v2] = 0;
            check[v2][v1] = 0;
            
                    visited = new boolean[n+1];
            count = 0;
            // 송전탑 개수 구하기
       
                dfs(1, n); // 첫 번째 전력망 송전탑 개수
                 int firstCount = count;
            int secondCount = n - firstCount; // 두 번째 전력망 송전탑 개수
            
            // 차이의 최솟값 갱신
            answer = Math.min(answer, Math.abs(firstCount - secondCount));
            
            // 전선 연결 다시 되돌리기
            check[v1][v2] = 1;
            check[v2][v1] = 1;
        }
        
        return answer;
    }
    
    // dfs로 송전탑 개수 계산
    public static void dfs(int p, int n) {
    
        visited[p] = true;
        count++;
        
        for(int i = 1; i<=n; i++){
            if(!visited[i] && check[p][i] == 1) {
                visited[i] = true;
                dfs(i,n);
            }
        }
}
}
// dfs 써서 하는건 생각 잘 했는데 구현하는데 시간 오래걸림...