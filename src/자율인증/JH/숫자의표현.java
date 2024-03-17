package 자율인증.JH;

class 숫자의표현 {
    public int solution(int n) {
        
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            if(check(i,n))
                answer++;
        }
        
        return answer;
    }
    
    public boolean check(int k, int n){
        
        int sum = 0;
        while(sum <n){
            sum += k;
            k++;
        }
        if(sum == n)
            return true;
        return false;
    }
}