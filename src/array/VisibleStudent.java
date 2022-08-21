package array;

import java.util.Scanner;

/**
 * 보이는 학생 문제
 * n명의 학생 입력 받아 학생의 키를 순서대로 입력해 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 출력ㄹ
 * (단, 앞의 학생보다 크면 보이고 작거나 같으면 보이지 않는다.)
 */
public class VisibleStudent {

    public int solution(int[] arr) {
        int answer = 1;
        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(new VisibleStudent().solution(arr));
    }
}
