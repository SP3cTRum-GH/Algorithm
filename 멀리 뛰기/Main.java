import java.io.BufferedReader;
import java.io.InputStreamReader;
class Solution {
    public static long solution(int n) {
        long answer = 0;
        long[] cash = new long[n+1];
        cash[0] = 1;
        cash[1] = 2;

        for(int i=2; i<n; i++){
            cash[i] = cash[i-1] + cash[i-2];

            if(cash[i]>=1234567){
                cash[i] = cash[i] % 1234567;
            }
        }

        answer = cash[n-1];
        return answer;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long answer = Solution.solution(n);

        System.out.println(answer);
    }
}