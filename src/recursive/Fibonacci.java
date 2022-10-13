package recursive;

import java.util.Scanner;

public class Fibonacci {

    static int[] fibo;
    public int recursion(int n) {
        if(fibo[n] > 0) return fibo[n];
        if(n == 1 || n == 2) return fibo[n] = 1;
        else return fibo[n] = recursion(n-2) + recursion(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        fibo = new int[n+1];

        new Fibonacci().recursion(n);
        for(int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}
