import java.io.BufferedReader;
import java.io.InputStreamReader;
class Solution {
    public int solution(int n) {
        int ans = Integer.bitCount(n);
        return ans;
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