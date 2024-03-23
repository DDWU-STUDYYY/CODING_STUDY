package greedy.JH;

import java.util.Arrays;

class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] arr = new int[n+1];
        Arrays.fill(arr, 1); // 모든 학생에게 체육복 1벌을 할당
        
        // 도난당한 학생들의 체육복 상태 반영
        for (int l : lost)
            arr[l]--;
        
        // 여벌의 체육복을 가진 학생들의 체육복 상태 반영
        for (int r : reserve)
            arr[r]++;
        
        // 체육복 빌려주기
        for (int i = 1; i <= n; i++) {
            if (arr[i] == 0) { // 도난당한 학생일 경우
                if (i-1 >= 1 && arr[i-1] == 2) { // 앞 번호 학생이 여벌의 체육복을 가진 경우
                    arr[i]++;
                    arr[i-1]--;
                } else if (i+1 <= n && arr[i+1] == 2) { // 뒷 번호 학생이 여벌의 체육복을 가진 경우
                    arr[i]++;
                    arr[i+1]--;
                }
            }
        }
        
        // 체육수업을 들을 수 있는 학생 수 계산
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] > 0) // 체육복이 있는 학생만 카운트
                answer++;
        }
        
        return answer;
    }
}
/*
  구현하느라 시간이 좀 걸린 문제. if 문의 범위 조건식을 저렇게 앞에 한번에 쓸 수 있구나를 깨달음
 */