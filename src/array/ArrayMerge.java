package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayMerge {

    public int[] solution(int[] arr1, int[] arr2) {
        int[] newArr = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).toArray();
        Arrays.sort(newArr);

        return newArr;
    }

    public ArrayList<Integer> solution2(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();

        int pointer1 = 0, pointer2 = 0;
        while(pointer1 < n && pointer2 < m) {
            if(arr1[pointer1] < arr2[pointer2]) {
                answer.add(arr1[pointer1++]);
            } else {
                answer.add(arr2[pointer2++]);
            }
        }

        while(pointer1 < n) answer.add(arr1[pointer1++]);
        while(pointer2 < m) answer.add(arr2[pointer2++]);

        return answer;
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

        for(int num : am.solution2(n, m, arr1, arr2)) {
            System.out.print(num + " ");
        }
    }
}
