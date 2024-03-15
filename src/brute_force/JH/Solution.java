package brute_force.JH;

import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        // 1번 따로 
        
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {2,1,2,3,2,4,2,5};
        int[] array3 = {3,3,1,1,2,2,4,4,5,5};
        
        int count1 = 0;
        int count2 = 0;
        int count3  = 0;

        // 이 부분이 메인이다. 즉 answer 의 길이를 기준으로 해주면서 반복되는 길이는 현재 기준에서 % 연산자를 사용하여 배열을 맞춰준다.
         for (int i = 0; i < answers.length; i++) {
            if (answers[i] == array1[i % array1.length])
                count1++;
            if (answers[i] == array2[i % array2.length])
                count2++;
            if (answers[i] == array3[i % array3.length])
                count3++;
        }
        
        int[] result = new int[3];
        
       result[0] = count1;
        result[1] = count2;
        result[2] = count3;
        
        // 저 수들 중 가장 높은 것을 구해야 한다. 
        
        int max = 0;
        
        for(int i=0; i<3; i++){
            if(result[i] > max)
                max = result[i];
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<3; i++){
            if(max == result[i])
                ans.add(i+1);
        }
        
        Collections.sort(ans);
        
        int[] arr = new int[ans.size()];
        
        for(int i=0; i<ans.size(); i++){
            arr[i] = ans.get(i);
        }
       
        return arr;
    
    }
}