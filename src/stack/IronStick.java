package stack;

import java.util.Scanner;
import java.util.Stack;

public class IronStick {

    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if(s.charAt(i-1) == '(') {
                    stack.pop();
                    answer += stack.size();
                } else {
                    answer++;
                    stack.pop();
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.print(new IronStick().solution(s));
    }
}
