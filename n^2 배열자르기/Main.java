import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left+1)];

        int index = 0;
        for(long i=left+1; i<=right+1; i++) {
            long div = i/n;
            long mod = i%n;
            if(mod == 0) {
                mod += n;
                div--;
            }

            if(div >= mod) {
                answer[index] = (int)(div+1);
            }
            else {
                answer[index] = (int)(mod);
            }
            index++;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long left = Long.parseLong(br.readLine());
        long right = Long.parseLong(br.readLine());

        int[] answer = Solution.solution(n,left,right);

        for(int i:answer){
            System.out.print(i+" ");
        }
    }
}