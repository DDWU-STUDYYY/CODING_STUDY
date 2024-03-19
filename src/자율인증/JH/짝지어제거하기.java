package 자율인증.JH;

import java.util.*;
// stack 을 활용하면 된다 !! 
class 짝지어제거하기
{
    public int solution(String s)
    {
       
        int answer = 0;
        
        int length = s.length();
        
        char[] arr = s.toCharArray();
        
        Stack<Character> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i=1; i<length; i++){
            if(!stack.isEmpty() && arr[i] == stack.peek())
                stack.pop();
            else 
                stack.push(arr[i]);
        }
        
        if(stack.isEmpty())
            return 1;
        return 0;
    }
}
/*
 백준에서 봤던 괄호 제거하기 문제와 유사하다. 그렇지만 pop 을 할 때에 스택이 비어있을 때의 조건을 추가해주어야 한다.
 스택이 비어있지 않을 때의 조건을 먼저 체크해 주어야 한다 !!
 */