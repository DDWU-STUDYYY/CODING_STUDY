package brute_force.JH;

import java.util.Scanner;

public class 조합코드 {

    static int[] arr = {1, 2, 3, 4, 5, 6};
    static int M;
    static int pCnt = 0, cCnt = 0, ppCnt = 0, ccCnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();

        //1. 순열
        comb(0, new int[M], int startIdx);
        System.out.println("순열: " + pCnt);

        //2. 중복순열
        // 위와 비슷하게 예시 작성
    }

    static void comb(int cnt, int[] selected, int startIdx){
         if(cnt == M){
             cCnt++;
             for(int i=0; i<cnt; i++){
                 System.out.print(selected[i]+" ");
             }
             System.out.println();
             return;
         }

       for(int i = startIdx; i<arr.length; i++){
           selected[cnt] = arr[i];
           comb(cnt+1, selected,startIdx+1);
       }
    }
}
/*
  종복조합

  static void comb(int cnt, int[] selected, int startIdx) {
     if(cnt == M) {
        cCnt++;
        for(int i=0; i<cnt; i++){
           System.out.println(selected[i] + " ");
           }
           System.out.println();
           return;
           }

           for(int i= startIdx; i<arr.length; i++){
            selected[cnt] = arr[i];
            comb(cnt+1, selected, i);
            }
 */
