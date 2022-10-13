package recursive;

import java.util.Scanner;

public class Factorial {

    public int recursion(int n) {
        if(n == 1) return 1;
        else return n*recursion(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(new Factorial().recursion(n));
    }
}
