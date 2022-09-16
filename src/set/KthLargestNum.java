package set;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class KthLargestNum {

    public int solution(int n, int k, int[] arr) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                for(int s = j+1; s < n; s++) {
                    set.add(arr[i]+arr[j]+arr[s]);
                }
            }
        }

        int cnt = 0;
        for(int num : set) {
            cnt++;
            if(cnt == k) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(new KthLargestNum().solution(n, k, arr));
    }
}
