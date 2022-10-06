package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mischief {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int[] newArr = arr.clone();
        Arrays.sort(newArr);

        for(int i = 0; i < n; i++) {
            if(arr[i] != newArr[i]) {
                answer.add(i+1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int num : new Mischief().solution(n, arr)) {
            System.out.print(num + " ");
        }
    }
}
