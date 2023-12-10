import java.io.BufferedReader;
import java.io.InputStreamReader;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        int temp = 1;
        int sum = 0;

        for(int i=1; i<=n; i++){
            sum += i;
            if(sum>n){
                break;
            }
            if(i%2 == 1){
                if(n%i==0){
                    count++;
                }
            }
            else {
                if (n % i == temp) {
                    count++;
                }
                temp++;
            }
        }

        answer = count;
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