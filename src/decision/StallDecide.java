package decision;

import java.util.Arrays;
import java.util.Scanner;

public class StallDecide {

    public int getCount(int[] arr, int distance) {
        int count = 1;
        int endPoint = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i]-endPoint >= distance) {
                endPoint = arr[i];
                count++;
            }
        }

        return count;
    }

    public int solution(int n, int c, int[] arr) {
        int answer = 0;

        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[n-1];
        while(lt <= rt) {
            int mid = (lt+rt)/2;
            if(getCount(arr, mid) >= c) {
                answer = mid;
                lt = mid+1;
            } else {
                rt = mid-1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(new StallDecide().solution(n, c, arr));
    }
}
