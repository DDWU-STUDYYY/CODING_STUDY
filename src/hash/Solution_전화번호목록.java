package hash;

import java.util.*;

// 문자열을 오름차순 정렬하면
// 12, 123, 1235, 567
// 바로 앞의 것과 비교만 하면 된다.
public class Solution_전화번호목록 {
  public boolean solution(String[] phone_book) {

    Arrays.sort(phone_book);

    for (int i = 0; i < phone_book.length - 1; i++) {
      if (phone_book[i + 1].startsWith(phone_book[i])) {
        return false;
      }
    }
    return true;
  }
}
