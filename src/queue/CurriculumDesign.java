package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CurriculumDesign {

    public String solution(String requireSub, String subject) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for(char c : requireSub.toCharArray()) {
            queue.offer(c);
        }

        for(char c : subject.toCharArray()) {
            if(queue.peek() == c) {
                stack.push(c);
                queue.poll();
            }

            if(queue.isEmpty()) break;
        }

        String s = "";
        for(int i = 0; i < stack.size(); i++) {
            s += stack.get(i);
        }

        if(s.equals(requireSub)) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String requireSub = sc.nextLine();
        String subject = sc.nextLine();

        System.out.print(new CurriculumDesign().solution(requireSub, subject));
    }
}
