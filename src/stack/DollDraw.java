package stack;

import java.util.Scanner;
import java.util.Stack;

public class DollDraw {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int pos : moves) {
            for(int i = 0; i < board.length; i++) {
                int doll = board[i][pos-1];
                if(doll == 0) continue;
                board[i][pos-1] = 0;
                if(stack.isEmpty()) {
                    stack.push(doll);
                } else {
                    if(stack.peek() == doll) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(doll);
                    }
                }
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] board = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];
        for(int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        System.out.print(new DollDraw().solution(board, moves));
    }
}
