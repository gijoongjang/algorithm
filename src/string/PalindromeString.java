package string;

import java.util.Scanner;

/**
 * 회문 문자열 문제
 * 회문 문자열이면 "YES" 아니면 "NO" 출력
 */
public class PalindromeString {

    public String solution(String str) {
        str = str.toUpperCase();
        for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.print(new PalindromeString().solution(s));
    }
}
