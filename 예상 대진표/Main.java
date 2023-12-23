import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer=0;

        while(a!=b){
            if(a%2==0){
                a = a/2;
            }
            else {
                a = (a+1)/2;
            }
            if(b%2==0){
                b = b/2;
            }
            else {
                b = (b+1)/2;
            }
            answer++;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int answer = new Solution().solution(n, a, b);

        System.out.println(answer);
    }
}