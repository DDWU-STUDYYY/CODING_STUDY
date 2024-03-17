package brute_force.JH;
import java.util.*;

public class 순열코드 {

    static int[] arr = { 1, 2, 3, 4, 5, 6 };
    static int M;
    static int pCnt = 0, cCnt = 0, ppCnt = 0, ccCnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();

        //1. 순열
        perm(0, new int[M], new boolean[arr.length]);
        System.out.println("순열: "+ pCnt);

        //2. 중복순열
        // 위와 비슷하게 예시 작성
    }

    static void perm(int cnt, int[] selected, boolean[] visited){
        if(cnt == M){
            pCnt++;
            for(int i=0; i<cnt; i++){
                System.out.println(selected[i] +" ");
            }
            System.out.println();
            return;
        }

        for(int i=0; i<arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                selected[cnt] = arr[i];
                perm(cnt+1, selected,visited);
                visited[i] = false;
            }
        }
    }
}

/*
  중복 순열 - 중복이 가능하므로 방문관리가 필요가 없다 그냥

  static void pperm(int cnt, int[] selected) {
      if(cnt == M) {
        ppCnt++;
        for(int i=0; i<cn;t i++) {
         System.out.println(selected[i] + " "_;
         }
         System.out.println();
         return;
   }

   for(int i=0; i<arr.length; i++){
       selected[cnt] = arr[i];
       pperm(cnt+1, selected);
      }

         */
