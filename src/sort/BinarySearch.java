package sort;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public int solution(int target, int[] arr) {
        Arrays.sort(arr);

        int lt = 0;
        int rt = arr.length-1;
        int mid;

        while(lt <= rt) {
            mid = (lt + rt) / 2;

            if(arr[mid] == target) return mid+1;
            if(arr[mid] > target) {
                rt = mid-1;
            } else {
                lt = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(new BinarySearch().solution(m, arr));
    }
}
