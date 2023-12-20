import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {

        int[] answer =new int[2];
        HashSet<String>s=new HashSet<>();
        s.add(words[0]);
        int fail = 0;

        for(int i=1; i< words.length; i++){
            if(s.contains(words[i])){
                fail = i+1;
                break;
            }
            if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                fail = i+1;
                break;
            }
            s.add(words[i]);
        }
        answer[0] = fail%n;
        answer[1] = fail/n;
        if(fail%n==0){
            answer[0] = n;
        }
        else{
            answer[1]++;
        }

        if(fail==0){
            answer[0] = 0;
            answer[1] = 0;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = br.readLine().split(" ");

        int[] answer = new Solution().solution(n,words);

        for(int i:answer){
            System.out.println(i);
        }
    }
}