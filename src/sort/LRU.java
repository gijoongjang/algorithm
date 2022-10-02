package sort;

import java.util.Scanner;

public class LRU {

    public int[] solution(int size, int n, int[] arr) {
        int[] cache = new int[size];
        for(int num : arr) {
            int pos = -1;
            for(int i = 0; i < size; i++) {
                if(num == cache[i]) {
                    pos = i;
                }
            }
            if(pos == -1) {
                for(int i = size-1; i >= 1; i--) {
                    cache[i] = cache[i-1];
                }
            } else {
                for(int i = pos; i >= 1; i--) {
                    cache[i] = cache[i-1];
                }
            }

            cache[0] = num;
        }

        return cache;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int num : new LRU().solution(s, n, arr)) {
            System.out.print(num + " ");
        }
    }
}
