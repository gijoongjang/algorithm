package decision;

import java.util.Arrays;
import java.util.Scanner;

public class MusicVideo {

    public int getCount(int[] arr, int capacity) {
        int count = 1;
        int sum = 0;

        for(int num : arr) {
            if(sum+num > capacity) {
                count++;
                sum = num;
            } else {
                sum+=num;
            }
        }

        return count;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt) {
            int mid = (lt+rt)/2;
            if(getCount(arr, mid) <= m) {
                answer = mid;
                rt = mid-1;
            } else {
                lt = mid+1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(new MusicVideo().solution(n, m, arr));
    }
}
