package recursive;

import java.util.Scanner;

public class Recursive {
    public void recursion(int n) {
        if(n == 0) return;
        recursion(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        new Recursive().recursion(n);
    }
}
