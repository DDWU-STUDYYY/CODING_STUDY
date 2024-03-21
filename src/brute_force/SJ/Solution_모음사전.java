package brute_force.SJ;

public class Solution_모음사전 {

  // 트리 구조로 생각하면...?

  String[] vowel= {"A", "E", "I", "O", "U"};
  String[] bucket = new String[5];
  int cnt = 0;
  int answer = 0;
  int flag = 0;

  public void pick(String letter, String word){
    if (letter.length() > 5 || flag == 1) {
      return;
    }

    if (letter.equals(word)) {
      flag = 1;
      answer = cnt;
      return;
    }

    cnt++;

    for (int i = 0; i < vowel.length; i++) {
      pick(letter + vowel[i], word);
    }
  }

  public int solution(String word) {
    pick("", word);
    return answer;
  }

}
