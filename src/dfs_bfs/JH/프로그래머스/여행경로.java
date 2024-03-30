package dfs_bfs.JH.프로그래머스;

import java.util.*;

class 여행경로 {
    boolean[] visited;
    ArrayList<String> allRoute;
    
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        int cnt = 0;
        visited = new boolean[tickets.length];
        allRoute = new ArrayList<>();
        
        dfs("ICN","ICN",tickets,cnt);
        
        Collections.sort(allRoute);
        answer = allRoute.get(0).split(" ");
        return answer;
    }
    
    public void dfs(String start, String route, String[][] tickets, int cnt){
        if(cnt == tickets.length){
            allRoute.add(route);
            return;
        }
        
        for(int i=0; i<tickets.length; i++){
            if(start.equals(tickets[i][0]) && !visited[i]){
                visited[i] = true;
                dfs(tickets[i][1], route +" " + tickets[i][1], tickets, cnt+1);
                visited[i] = false;
                
            }
        }
    }
}
/*
이 코드에서 visited[i] = false가 하는 일은 백트래킹(backtracking)과 관련이 있습니다. 백트래킹은 DFS(깊이 우선 탐색)를 사용하여 해를 찾아가는 과정에서, 해를 찾기 위해 특정 조건을 만족하지 않는 경로를 탐색하는 과정입니다.

여기서 visited 배열은 각각의 티켓이 방문되었는지 여부를 나타내기 위한 배열입니다. 이 배열은 각 티켓을 사용하여 여행하는 과정에서 해당 티켓이 이미 사용되었는지 여부를 추적합니다. 따라서 특정 티켓을 사용한 후에는 해당 티켓을 다시 사용할 수 없도록 visited[i] 값을 true로 설정합니다.

하지만 모든 경로를 탐색한 후에는 다른 경로를 탐색하기 위해 visited 배열을 초기화해야 합니다. 이를 위해 백트래킹을 수행하는 도중에 visited[i] 값을 다시 false로 설정하여 해당 티켓을 다시 사용할 수 있도록 합니다. 이는 다음 경로를 탐색할 때 이전 경로에서 사용된 티켓을 다시 사용할 수 있도록 해줍니다.

따라서 visited[i] = false는 경로 탐색을 완료한 후에 해당 티켓을 다시 사용할 수 있도록 visited 배열을 초기화하는 역할을 합니다.


 */