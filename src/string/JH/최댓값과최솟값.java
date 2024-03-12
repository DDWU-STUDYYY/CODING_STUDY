package string.JH;

import java.util.*;

class 최댓값과최솟값 {
    public String solution(String s) {
        
        
        String answer = "";
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        String[] split = s.split(" ");
        
        for(int i=0; i<split.length; i++){
            arr.add(Integer.parseInt(split[i]));
        }
        
        answer = Collections.min(arr)+" "+ Collections.max(arr);
        return answer;
    }
}
/*
 Collections.max 와 Collections.min 이 있다.
 */