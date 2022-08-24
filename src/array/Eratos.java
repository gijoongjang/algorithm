package array;

import java.util.Scanner;

/**
 * 소수(에라토스테네스 체) 문제
 * 자연수 n이 입력되면 1부터 n까지의 소수의 개수를 출력
 */
public class Eratos {

    public int solution(int n) {
        int answer = 0;

        int[] arr = new int[n+1];
        for(int i = 2; i <= n; i++) {
            if(arr[i] == 0) {
                answer++;
                for(int j = i; j <= n; j=j+i) {
                    arr[j] = 1;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(new Eratos().solution(n));
    }
}
