package array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 큰 수 출력하기
 * n개의 정수를 입력받아, 자신의 바로 앞 수보더 큰 수만 출력
 */
public class BigNumber {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i = 1; i < n; i++) {
            if(arr[i] > arr[i-1]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        BigNumber bn = new BigNumber();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int num : bn.solution(n, arr)){
            System.out.print(num + " ");
        }
    }
}
