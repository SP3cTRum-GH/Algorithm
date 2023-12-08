import java.io.BufferedReader;
import java.io.InputStreamReader;
class Solution {
    public int[] solution(String s) {
        int count = 0;
        int deletecount = 0;
        String temp = s;
        String nozero = "";
        while(!temp.equals("1")) {
            nozero = temp.replaceAll("0", "");
            deletecount += temp.length() - nozero.length();
            nozero = Integer.toBinaryString(nozero.length());
            temp = nozero;
            count++;
        }

        int[] answer = {count, deletecount};
        return answer;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] answer = new Solution().solution(s);

        for (int i:answer){
            System.out.println(i);
        }
    }
}