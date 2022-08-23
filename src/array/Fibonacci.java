package array;

import java.util.Scanner;

/**
 * 피보나치 수열 문제
 */
public class Fibonacci {

    public int[] solution(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int num : fibonacci.solution(n)) {
            System.out.print(num + " ");
        }
    }
}
