package brute_force.SJ;

import java.util.ArrayList;
import java.util.List;

public class Soultion_모의고사 {

    // 1번 12345 [01234] [56789] [] 5
    // 2번 21232425 [01234567] 8
    // 3번 3311224455 [0123456789] 10
    public int[] solution(int[] answers) {
      int[] answer = {1, 2, 3};

      int[] n1 = {1,2,3,4,5};
      int[] n2 = {2,1,2,3,2,4,2,5};
      int[] n3 = {3,3,1,1,2,2,4,4,5,5};

      int cnt1 = 0;
      int cnt2 = 0;
      int cnt3 = 0;

      for (int i = 0; i < answers.length; i++) {

        if (n1[i % n1.length] == answers[i]) {
          cnt1++;
        }

        if (n2[i % n2.length] == answers[i]) {
          cnt2++;
        }

        if (n3[i % n3.length] == answers[i]) {
          cnt3++;
        }
      }

      answer[0] = cnt1;
      answer[1] = cnt2;
      answer[2] = cnt3;

      int max = Math.max(cnt1, cnt2);
      max = Math.max(max, cnt3);

      List<Integer> answerList = new ArrayList<>();

      for (int i = 0 ; i < answer.length; i++) {
        if (max == answer[i]) {
          answerList.add(i + 1);
        }
      }

      return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
  }

