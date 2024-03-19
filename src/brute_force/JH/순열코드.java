package brute_force.JH;
import java.util.*;

public class 순열코드 {

    static int[] arr = {1, 2, 3, 4, 5, 6};
    static int M;
    static int pCnt = 0, cCnt = 0, ppCnt = 0, ccCnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();

        //1. 순열
        perm(0, new int[M], new boolean[arr.length]);
        System.out.println("순열: " + pCnt);

        //2. 중복순열
        // 위와 비슷하게 예시 작성
    }

    static void perm(int cnt, int[] selected, boolean[] visited) {
        if (cnt == M) {    // 기저조건
            pCnt++;
            for (int i = 0; i < cnt; i++) {
                System.out.print(selected[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;    // 방문 처리
                selected[cnt] = arr[i];    //배열의 i 번째 선택하기
                perm(cnt + 1, selected, visited);    // 다음 순열 뽑기
                visited[i] = false;    // 방문 처리 풀음
            }
        }
    }
}

/*
  중복 순열 - 중복이 가능하므로 방문관리가 필요가 없다 그냥

 static void pperm(int cnt, int[] selected) {
		if(cnt == M) {
			ppCnt++;
			for(int i=0;i<cnt;i++) {
				System.out.print(selected[i]+ " ");
			}
			System.out.println();
			return;
		}
		for(int i=0;i<arr.length;i++) {
			selected[cnt]=arr[i];
			pperm(cnt+1, selected);
		}
	}

         */
