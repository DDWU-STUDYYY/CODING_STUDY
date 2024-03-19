package brute_force.JH;

// 완전 탐색 인데 순열을 사용해야 겠다는 생각이 든다
// 그리고 순열 돌리는 메서드랑 던전에서 얼마나 탐색이 가능한지 체크하는 메서드 두개가 필요함
class 피로도 {
    
    static int length;
    static int kk;
    static int answer;
    static int max;
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        length = dungeons.length;
        kk = k;
        max = 0;
        permutation(0, new int[length], new boolean[length],dungeons);
        return max-1;
    }
    
    public static void permutation(int cnt, int[] selected, boolean[] visited, int[][] dungeons){
        
        if(cnt == length){
            checkMax(selected,dungeons);
            return;
        }
        
        for(int i=0; i<length; i++){
            if(!visited[i]){
                visited[i] = true;
                selected[cnt] = i;
                permutation(cnt+1, selected, visited,dungeons);
                visited[i] = false;
            }
        }
    }
    
    public static void checkMax(int[] selected, int[][] dungeons){
        
        int count = 1;
        int check = kk;
        for(int i=0; i<selected.length; i++){
            if(dungeons[selected[i]][0] <= check){
                check -= dungeons[selected[i]][1];
                count++;
                max = Math.max(max,count);
            }
            else {
                break;
            }
        }
    }
}
/*
 혼자 품 아싸 !!
 순열 코드 외우자 제발
 */