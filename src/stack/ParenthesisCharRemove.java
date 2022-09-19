package stack;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisCharRemove {

    public Stack<Character> solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c != ')') {
                stack.push(c);
            } else {
                while(stack.pop() != '(');
            }
        }

        return stack;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        for(char c : new ParenthesisCharRemove().solution(s)) {
            System.out.print(c);
        }
    }
}
