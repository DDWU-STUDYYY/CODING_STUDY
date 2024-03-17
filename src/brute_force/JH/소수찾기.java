package brute_force.JH;

import java.util.*;

class 소수찾기 {
    static Set<Integer> set;
    
    public int solution(String numbers) {
        set = new HashSet<>();
        char[] arr = numbers.toCharArray();
        boolean[] visited = new boolean[arr.length];
        
        for (int i = 1; i <= arr.length; i++) {
            permutation(arr, visited, 0, i, new StringBuilder());
        }
        
        int answer = 0;
        for (int num : set) {
            if (isPrime(num)) answer++;
        }
        return answer;
    }
    
    public void permutation(char[] arr, boolean[] visited, int depth, int length, StringBuilder sb) {
        if (depth == length) {
            int num = Integer.parseInt(sb.toString());
            if (num > 1) set.add(num);
            return;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sb.append(arr[i]);
                permutation(arr, visited, depth + 1, length, sb);
                sb.deleteCharAt(sb.length() - 1);
                visited[i] = false;
            }
        }
    }
    
    public boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
/*
 Set 으로 생각하는 것은 잘 했는데      sb.deleteCharAt(sb.length() - 1); 이 부분을 다시 잘 생각해 주어야 한다 !!

 */
