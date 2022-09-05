package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CommonElement {

    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();

        int pointer1 = 0, pointer2 = 0;
        while(pointer1 < n && pointer2 < m) {
            if(arr1[pointer1] == arr2[pointer2]) {
                answer.add(arr1[pointer1]);
                pointer1++;
                pointer2++;
            } else if(arr1[pointer1] < arr2[pointer2]) {
                pointer1++;
            } else {
                pointer2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CommonElement ce = new CommonElement();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int num : ce.solution(n, m, arr1, arr2)) {
            System.out.print(num + " ");
        }
    }
}
