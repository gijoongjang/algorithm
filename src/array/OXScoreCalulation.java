package array;

import java.util.Scanner;

/**
 * 점수 계산 문제
 * OX 문제에서 맞으면 1점 틀리면 0점 처리
 * 연속으로 문제를 맞힐 경우 K번째 문제 만큼 가산점을 받는다
 */
public class OXScoreCalulation {

    public int solution(int[] arr) {
        int count = 0;
        int answer = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                count = 0;
            } else {
                count++;
                answer += count;
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(new OXScoreCalulation().solution(arr));
    }
}
