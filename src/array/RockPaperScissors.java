package array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 가위 바위 보 문제
 */
public class RockPaperScissors {
    public ArrayList<Character> solution(int n, int[] arr1, int[] arr2) {
        ArrayList<Character> answer = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(arr1[i] == arr2[i]) {
                answer.add('D');
            } else if(arr1[i] == 1 && arr2[i] == 3) {
                answer.add('A');
            } else if(arr1[i] == 2 && arr2[i] == 1) {
                answer.add('A');
            } else if(arr1[i] == 3 && arr2[i] == 2) {
                answer.add('A');
            } else {
                answer.add('B');
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        RockPaperScissors rps = new RockPaperScissors();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        for(char c : rps.solution(n, arr1, arr2)) {
            System.out.println(c);
        }
    }
}
