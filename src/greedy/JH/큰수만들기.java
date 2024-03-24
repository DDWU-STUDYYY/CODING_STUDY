package greedy.JH;

class 큰수만들기 {
    public String solution(String number, int k) {

        
        String answer = "";
        StringBuilder answerBuilder = new StringBuilder();

        
        char[] array = number.toCharArray();
        
        int len = array.length - k;

        int start = 0;

        for(int i =0; i<len; i++){
            char max = '0';
            for(int j = start; j <= i + k; j++){

                if(array[j] > max){ // 이게 중요....
                    max = array[j];
                    start=j+1;
                }
            }

            answerBuilder.append(Character.toString(max));
        }
        
        // k개의 수를 제거할 때 얻을 수 있는 가장 큰 숫자를 구하려 한다 
        answer = answerBuilder.toString();
        return answer;
    }
    
}
/*
  계속해서 안나와서 다른 사람 블로그 참고하였음... 뒤에서부터 한다고 생각하면 쉬운 문제였음... ㅠㅠ
 */