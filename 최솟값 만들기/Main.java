import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int size = A.length;
        for(int i=0; i<size; i++) answer += A[i] * B[size-1-i];

        return answer;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String[] s1 = br.readLine().split(" ");

        int[] A = new int[s.length];
        int[] B = new int[s1.length];

        for(int i=0; i<s.length; i++){
            A[i] = Integer.parseInt(s[i]);
        }
        for(int i=0; i<s1.length; i++){
            B[i] = Integer.parseInt(s1[i]);
        }

        int answer = new Solution().solution(A,B);
        System.out.println(answer);
    }
}