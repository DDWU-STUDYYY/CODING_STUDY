package hash.JH;

import java.util.*;

class Programmars_의상 {
    public int solution(String[][] clothes) {

        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0; i<clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }

        int answer = 1;

        for(String s : map.keySet()){ // map 의 key 를 다 가져온다
            answer *= map.get(s)+1;
        }

        // 모든 옷을 다 고르지 않는 경우이다.

        return answer-1;



    }
}
