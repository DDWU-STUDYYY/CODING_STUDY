package brute_force.JH;

class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int r=1;r<=yellow;r++) { // 노란 타일의 가로 개수 결정하기
            if(yellow % r == 0) {
                int col = yellow / r;
                int b = (r + col) * 2 + 4;
                if(brown == b) {
                    answer[0] = r+2;
                    answer[1] = col+2;
                }
            }
        }
        return answer;
    }
}
/*
 처음에 방법이 잘 떠오르지 않아서 구글링 했음... 그냥 완전탐색으로 모든 경우의 수를 다 봐주면 됨
 */