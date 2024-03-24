package greedy.SJ;

public class Solution_큰수만들기 {
  public String solution(String number, int k) {

    // 1231234
    // k = 3일때, length = 7
    // 뒷문자 2(k-1)개를 제외하고 앞전의 5개 중에 뽑아야함 (12312/34)

    // k = 2일때, length = 6
    // 뒷문자 1개를 제외하고 앞전의 5개 중에 뽑아야함 (12123/4)
    char[] numberArr = number.toCharArray();

    StringBuilder answerBuilder = new StringBuilder();// 안쓰면 시간 초과

    Integer startIdx = 0;
    Integer len = numberArr.length - k;

    for(int i = 0; i < len; i++) {
      char max = '0';

      for(int j = startIdx; j <= i + k; j++) {
        if (numberArr[j] > max){
          max = numberArr[j];
          startIdx = j + 1;
        }
      }
      answerBuilder.append(Character.toString(max));
    }

    return answerBuilder.toString();
  }
}
