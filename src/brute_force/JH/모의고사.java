package brute_force.JH;

class 모의고사 {
    public int solution(int[][] sizes) {
        int max_w = 0;
        int max_h = 0;
        
        for (int i = 0; i < sizes.length; i++) {
          max_w = Math.max(max_w, Math.max(sizes[i][0],sizes[i][1]));
          max_h = Math.max(max_h, Math.min(sizes[i][0],sizes[i][1]));
        }
        
        return max_w * max_h;
    }
}
/*
  아이디어를 잘 생각하지 못하였다 ㅠㅠ Math 와 min 메서드 이번기회에 알아두기...!
 */