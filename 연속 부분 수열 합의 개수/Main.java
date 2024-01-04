import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static int solution(int[] elements) {
        int answer = 0;

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i:elements){
            set.add(i);
            arr.add(i);
        }

        int elementsSize = elements.length;
        for(int i=0; i<elementsSize; i++){
            int sum=elements[i];
            for( int j=i+1; j<i+elementsSize; j++){
                sum += arr.get(j);
                set.add(sum);
            }
            arr.add(elements[i]);
        }

        answer = set.size();
        return answer;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] elements = new int[s.length];
        for(int i=0; i<s.length; i++){
            elements[i] = Integer.parseInt(s[i]);
        }

        int answer = Solution.solution(elements);

        System.out.println(answer);
    }
}