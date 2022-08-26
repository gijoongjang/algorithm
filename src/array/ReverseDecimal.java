package array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 뒤집은 소수 문제
 * n개의 자연수가 입력되면 그 수를 뒤집어서 소수 이면 출력
 * 단, 첫자리부터의 연속된 0은 무시한다.
 */
public class ReverseDecimal {

    public boolean isDecimal(String s) {
        int num = Integer.parseInt(s);
        if(num == 1) return false;
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int num : arr) {
            String temp = new StringBuilder(String.valueOf(num)).reverse().toString();

            if(isDecimal(temp)) {
                answer.add(Integer.parseInt(temp));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ReverseDecimal rd = new ReverseDecimal();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int num : rd.solution(n, arr)) {
            System.out.print(num + " ");
        }
    }
}
