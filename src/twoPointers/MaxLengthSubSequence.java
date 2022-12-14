package twoPointers;

import java.util.Scanner;

public class MaxLengthSubSequence {

    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int count = 0;
        int lt = 0;

        for(int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) {
                count++;
            }
            while(count > k) {
                if(arr[lt] == 0) {
                    count--;
                }
                lt++;
            }

            answer = Math.max(answer, rt-lt+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(new MaxLengthSubSequence().solution(n, k, arr));
    }
}
