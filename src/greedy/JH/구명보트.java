package greedy.JH;

import java.util.*;

class 구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int left = 0; // 구명보트 왼쪽 인덱스
        int right = people.length - 1; // 구명보트 오른쪽 인덱스
        
        Arrays.sort(people);
        
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++; // 왼쪽 인덱스 증가
            }
            right--; // 오른쪽 인덱스 감소
            answer++; // 구명보트 사용 횟수 증가
        }
        
        return answer;
    }
}
/*
 이것도 쉬워보이는데 하다하다 안돼서 풀이 참조 ^^
 */