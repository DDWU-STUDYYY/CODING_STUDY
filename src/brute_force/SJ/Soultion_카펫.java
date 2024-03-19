package brute_force.SJ;

import java.util.*;

public class Soultion_카펫 {

    public int[] solution(int brown, int yellow) {
      int[] answer = new int[2];
      int yRow = 0;
      int yColum = 0;

      for (int i = 1; i <= Math.sqrt(yellow); i++) {
        if (yellow % i == 0) {
          yRow = i;
          yColum = yellow / i ;

          if (yRow * 2 + yColum * 2 + 4 == brown) {
            answer[0] = yColum + 2;
            answer[1] = yRow + 2;
          }
        }
      }
      return answer;
    }
  }

