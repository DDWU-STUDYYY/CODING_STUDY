package stack_queue.SJ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_기능개발 {

  // 앞의 기능이 먼저 배포되어야함
// 뒤의 것이 먼저 완성되어도 앞의 것이 완성되지 않으면 배포되지 못함
// 뒤의 것은 앞의 기능이 먼저 배포될 때까지 기다려야함.
// 7일 걸림, 3일 걸림, 9일 걸림(남은 일 수)일 때 2개, 1개
// 5일 걸림, 10일 걸림, 1일 걸림, 1일 걸림, 20일 걸림, 1일 때 1개, 3개, 2개
    public static int[] solution(int[] progresses, int[] speeds) {
      int[] answer = {};

      List<Integer> releaseDays = new ArrayList<Integer>();
      List<Integer> remainDays = new ArrayList<Integer>();

      int n = 0;
      for (int i = 0; i < progresses.length; i++) {
        n = (100 - progresses[i]) / speeds[i];
        if ((100 - progresses[i]) % speeds[i] != 0){
          n++;
        }
        remainDays.add(n);
      }

      int cnt = 1;
      while(!remainDays.isEmpty()){
        System.out.println(remainDays.size());
        if (remainDays.size() == 1 || remainDays.get(0) < remainDays.get(1)){
          releaseDays.add(cnt);
          cnt = 1;
        } else {
          cnt++;
        }
        remainDays.remove(0);

      }
      // for (int i = 1; i < remainDays.size(); i++){

      // if (remainDays.get(i - 1) < remainDays.get(i)) {
      //     releaseDays.add(cnt);
      //     remainDays.remove();
      //     cnt = 0;
      // }else {
      //     cnt++;
      // }
      // }

      return releaseDays.stream().mapToInt(i -> i).toArray();


    }
  public static void main(String[] args) throws Exception {

    int[] progresses = {93, 30, 55};
    int[] speeds = {1, 30, 5};

    int[] answer = solution(progresses, speeds);

    for (int i : answer) {
      System.out.print(i + " ");
    }
  }

}
