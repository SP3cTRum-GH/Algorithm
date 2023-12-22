import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer =0;

        int idx= 0;
        for(int i= people.length-1; i>=0; i--){
            if(i<idx){
                break;
            }
            if(people[i]+people[idx]<=limit){
                idx++;
            }
            answer++;
        }
        return answer;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] people = new int[s.length];
        for(int i=0; i<s.length; i++){
            people[i] = Integer.parseInt(s[i]);
        }
        int limit = Integer.parseInt(br.readLine());

        int answer = new Solution().solution(people, limit);

        System.out.println(answer);
    }
}