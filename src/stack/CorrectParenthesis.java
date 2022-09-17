package stack;

import java.util.Scanner;
import java.util.Stack;

public class CorrectParenthesis {

    public String solution(String s) {
        String answer = "YES";

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }

        if(!stack.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(new CorrectParenthesis().solution(s));
    }
}
