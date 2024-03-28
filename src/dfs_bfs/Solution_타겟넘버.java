package dfs_bfs;

import java.util.*;

class Solution_타겟넘버 {

  String[] op = {"-", "+"};
  int answer = 0;
  int temp = 0;

  public void dfs(int[] numbers, int target, int r, int cnt) {
    if (r == numbers.length) {
      if (target == cnt){
        answer++;
      }
      return;
    }

    for(int i = 0; i < 2; i++){
      if (op[i].equals("+")){
        dfs(numbers, target, r + 1, cnt + numbers[r]);
      }else{
        dfs(numbers, target, r + 1, cnt - numbers[r]);
      }

    }


  }
  public int solution(int[] numbers, int target) {

    dfs(numbers, target, 0, 0);
    return answer;
  }
}