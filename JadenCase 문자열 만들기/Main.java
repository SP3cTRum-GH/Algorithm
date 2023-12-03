import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public String solution(String s) {
        String answer = "";

        s = s.toLowerCase();

        char c;
        for(int i=0; i<s.length(); i++){
            if(i==0) {
                c = s.charAt(i);
                c = Character.toUpperCase(c);
                answer += c;
                continue;
            }
            if(s.charAt(i-1)==' '){
                c = s.charAt(i);
                c = Character.toUpperCase(c);
                answer += c;
                continue;
            }
            answer+=s.charAt(i);
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String answer = new Solution().solution(s);
        System.out.println(answer);
    }
}