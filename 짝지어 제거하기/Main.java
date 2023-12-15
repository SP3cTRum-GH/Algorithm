import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;

        ArrayList<Character> arrl = new ArrayList<>();

        arrl.add(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            if(arrl.isEmpty()==true){
                arrl.add(s.charAt(i));
            }
            else if(s.charAt(i) == arrl.get(arrl.size()-1)){
                arrl.remove(arrl.size()-1);
            }
            else{
                arrl.add(s.charAt(i));
            }
        }

        if(arrl.isEmpty()){
            answer = 1;
        }
        else{
            answer = 0;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int answer = new Solution().solution(s);

        System.out.println(answer);
    }
}