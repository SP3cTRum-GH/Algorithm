import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.math.BigInteger;

class Solution {
    public int solution(int[] arr) {
        int answer=0;
        BigInteger[] bi = new BigInteger[arr.length];
        for(int i=0; i<arr.length; i++){
            bi[i] = BigInteger.valueOf(arr[i]);
        }

        BigInteger gcd;
        BigInteger lcm = bi[0];
        for(int i=1; i<bi.length; i++){
            gcd = lcm.gcd(bi[i]);
            lcm = gcd.multiply(lcm.divide(gcd).multiply(bi[i].divide(gcd)));
        }

        answer = lcm.intValue();
        return answer;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] arr = new int[s.length];
        for(int i=0; i<s.length; i++) arr[i] = Integer.parseInt(s[i]);

        int answer = new Solution().solution(arr);

        System.out.println(answer);
    }
}