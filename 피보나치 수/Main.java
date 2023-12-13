import java.io.BufferedReader;
import java.io.InputStreamReader;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int []fibo = new int[n+1];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i=2; i<=n; i++){
            fibo[i] = fibo[i-1]%1234567 + fibo[i-2]%1234567;
        }


        answer = fibo[n] % 1234567;

        return answer;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int answer = new Solution().solution(n);

        System.out.println(answer);
    }
}