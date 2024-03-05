package stack_queue.SJ;

import java.util.Stack;

public class Solution_올바른괄호  {
  boolean solution(String s) {

    Stack<Character> st = new Stack<>();

      for (char ch : s.toCharArray()) {
        if (ch == '(') {
          st.push(ch);
        } else {
          if (st.isEmpty()){
            return false;
          }
          st.pop();
        }
      }

    return st.isEmpty();
  }
}
