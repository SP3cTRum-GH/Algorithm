import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int tmp = (brown+4)/2;

        for(int i=1; i<tmp; i++){
            if((tmp-i-2)*(i+2) == brown+yellow){
                answer[0] = tmp-i-2;
                answer[1] = i+2;
                break;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int brown = Integer.parseInt(br.readLine());
        int yellow = Integer.parseInt(br.readLine());

        int[] answer = new Solution().solution(brown,yellow);

        for(int i:answer){
            System.out.println(i);
        }
    }
}