import java.io.BufferedReader;
import java.io.InputStreamReader;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int count =0;
        int temp = n;
        int temp2 = 0;
        int tcount =0;

        while(temp !=0){
            if(temp%2 == 1){
                count++;
            }
            temp=temp/2;
        }

        while(true) {
            n++;
            temp2 = n;
            tcount = 0;
            while (temp2 != 0) {
                if (temp2 % 2 == 1) {
                    tcount++;
                }
                temp2 = temp2 / 2;
            }

            if (tcount == count) {
                break;
            }
        }

        answer = n;
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