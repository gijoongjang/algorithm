package twoPointers;

import java.util.Scanner;

public class ContinuousNumSum {

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int sum = 0;
        int lt = 0;

        for(int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            while(sum > n) {
                sum -= arr[lt++];
            }
            if(sum == n) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = (n/2)+1;

        int[] arr = new int[m];
        for(int i = 0; i < m; i++) {
            arr[i] = i+1;
        }

        System.out.print(new ContinuousNumSum().solution(n, m, arr));
    }
}
