package 자율인증.SJ;

import java.util.Arrays;

public class Solution_JadenCase문자열만들기 {

  public String solution(String s) {
    String answer = "";
    String[] strArr = s.split(" ");

    String[] newArr = new String[strArr.length];
    int idx = 0;

    for (String str : strArr){

      if (!str.isEmpty()){
        String temp = str.substring(0, 1).toUpperCase()
            + str.substring(1).toLowerCase();
        newArr[idx++] = temp;
      }else {
        newArr[idx++] = str;
      }
    }

    answer = Arrays.stream(newArr)
        .reduce((s1, s2) -> s1 + " " + s2).orElse("");

    if (s.substring(s.length() - 1, s.length()).equals(" ")) {
      return answer+ " ";
    }

    return answer;
  }

}
