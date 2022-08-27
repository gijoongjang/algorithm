package array;

import java.util.Scanner;

/**
 * 등수 구하기 문제
 * n명의 학생의 시험 점수가 입력되면 학생의 등수를 입력된대로 출력
 */
public class Rank {

    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for(int i = 0; i < n; i++) {
            int count = 1;
            for(int j = 0; j < n; j++) {
                if(arr[i] < arr[j]) {
                    count++;
                }
            }
            answer[i] = count;
        }

        return answer;
    }

    public static void main(String[] args) {
        Rank rank = new Rank();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int num : rank.solution(n, arr)) {
            System.out.print(num + " ");
        }
    }
}
