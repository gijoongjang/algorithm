package array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayMerge {

    public int[] solution(int[] arr1, int[] arr2) {
        int[] newArr = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).toArray();
        Arrays.sort(newArr);

        return newArr;
    }

    public static void main(String[] args) {
        ArrayMerge am = new ArrayMerge();

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

        for(int num : am.solution(arr1, arr2)) {
            System.out.print(num + " ");
        }
    }
}
