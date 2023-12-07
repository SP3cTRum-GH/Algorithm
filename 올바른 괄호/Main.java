import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Boolean> stack = new Stack();

        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == '(') stack.add(true);
            else {
                if(stack.empty()) {
                    stack.add(false);
                    break;
                }
                stack.pop();
            }
        }

        if(stack.empty()) answer = true;
        else answer = false;

        return answer;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        boolean answer = new Solution().solution(s);
        System.out.println(answer);
    }
}