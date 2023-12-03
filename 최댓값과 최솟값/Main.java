import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String []s1 = s.split(" ");
        int []numlist = new int[s1.length];

        for(int i=0; i<s1.length; i++) numlist[i] = Integer.parseInt(s1[i]);

        Arrays.sort(numlist);
        String answer = numlist[0] + " " + numlist[numlist.length-1];

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