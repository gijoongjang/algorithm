package stack;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {

    public int calculation(int rt, int lt, char c) {
        switch (c) {
            case '+' : return lt + rt;
            case '-' : return lt - rt;
            case '*' : return lt * rt;
            case '/' : return lt / rt;
        }

        return -1;
    }

    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                stack.push(c-48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                int num = calculation(rt, lt, c);
                stack.push(num);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.print(new Postfix().solution(s));
    }
}
