package sort;

import java.util.Scanner;

public class SelectionSort {

    public int[] solution(int n, int[] arr) {
        for(int i = 0; i < n; i++) {
            int min = i;
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int num : new SelectionSort().solution(n, arr)) {
            System.out.print(num + " ");
        }
    }
}
