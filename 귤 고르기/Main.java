import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    static public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i:tangerine){
            h.put(i,h.getOrDefault(i,0)+1);
        }

        ArrayList<Map.Entry<Integer,Integer>> l = new ArrayList<>(h.entrySet());
        l.sort(Map.Entry.comparingByValue());

        for(int i=l.size()-1; i>=0; i--){
            if(l.get(i).getValue()<k){
                k = k-l.get(i).getValue();
                answer++;
            }
            else {
                answer++;
                break;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] tangerine = new int[s.length];
        for(int i=0; i<s.length; i++){
            tangerine[i] = Integer.parseInt(s[i]);
        }

        int answer = Solution.solution(k,tangerine);

        System.out.println(answer);
    }
}