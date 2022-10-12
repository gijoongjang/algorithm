package recursive;

import java.util.Scanner;

public class BinaryNumber {

    public void recursion(int n) {
        if(n == 0) return;

        int k = n%2;

        recursion(n/2);

        System.out.print(k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        new BinaryNumber().recursion(n);
    }
}
