package sort.JH;

import java.util.*;
class 가장큰수 {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
    
      Arrays.sort(arr, (o1,o2) -> (o2+o1).compareTo(o1+o2));
        
        if(arr[0].equals("0")){
            return "0";
        }
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<arr.length; i++){
            answer.append(arr[i]);
        }
        
        return answer.toString();
    }
}
/*
  sort 하는거 잘 보기 그리고 toString() 으로 마지막에 return 이 되어야 한다.
 */