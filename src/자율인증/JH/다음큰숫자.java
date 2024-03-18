package 자율인증.JH;

// 2진수 변환 메서드 사용하고 1의 개수 써서 return 해주기
class 다음큰숫자 {
    public int solution(int n) {
        
        String s = Integer.toBinaryString(n);
        char[] arr = s.toCharArray();
        int answer = 0;
        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == '1')
                count++;
        }
        
        int sum; 
        for(int i = n+1; i<=1000000; i++){
            sum = 0;
            String k = Integer.toBinaryString(i); // 이 메서드 잘 활용하기
            char check[] = k.toCharArray();
            
            for(int j=0; j<check.length; j++){
                if(check[j] == '1'){
                    sum++;
                }
               
            }
             if(count==sum){
                    answer = i;
                    break;
            }
        }
        
        return answer;
        
        
        
    }
}