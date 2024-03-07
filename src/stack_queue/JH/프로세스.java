package stack_queue.JH;

import java.util.*;

class 프로세스 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : priorities){
            queue.offer(i);
        }
        
        while(!queue.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(queue.peek() == priorities[i]){
                    queue.poll();
                    answer++;
                    
                    if(location == i)
                        return answer;
                }
            }
        }
        
        return answer;
    }
}
/*
  기본적으로 우선순위 큐는 오름차순 정렬이기 때문에 Collections.reverseOrder() 를 해준다 !!
 */