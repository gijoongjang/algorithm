package string;

import java.util.Scanner;

/**
 * 유효한 팰린드롬 문제
 * 문자열이 팰린드롬이면 "YES" 아니면 "NO" 출력
 * 단 회문 검사시 알파벳만 검사 대소문자 구분하지 않는다
 */
public class AvailablePalindrome {

    public String solution(String str) {
        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        String temp = new StringBuilder(str).reverse().toString();

        if(str.equals(temp)) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.print(new AvailablePalindrome().solution(s));
    }
}
