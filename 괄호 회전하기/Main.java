import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static int solution(String s) {
        int answer = 0;

        ArrayList<Character> arr = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            arr.add(s.charAt(i));
        }

        HashSet<Character> set = new HashSet<>();
        set.add('(');
        set.add('{');
        set.add('[');

        int stringSize = s.length();
        for(int i=0; i<stringSize; i++){
            arr.add(s.charAt(i));
            Stack<Character>stack = new Stack<>();
            for(int j=i+1; j<stringSize+i+1; j++){
                if(set.contains(arr.get(j))) {
                    stack.push(arr.get(j));
                }
                if(stack.empty()) {
                    stack.push('n');
                    break;
                }
                if(arr.get(j) == ')') {
                    if(stack.peek() == '(') {
                        stack.pop();
                    }
                    else {
                        break;
                    }
                }
                if(arr.get(j) == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    }
                    else {
                        break;
                    }
                }
                if(arr.get(j) == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    }
                    else {
                        break;
                    }
                }
            }
            if(stack.empty() == true) {
                answer++;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int answer = Solution.solution(s);

        System.out.println(answer);
    }
}