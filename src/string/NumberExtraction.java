package string;

import java.util.Scanner;

/**
 * 숫자만 추출 문제
 * 문자와 숫자가 섞여있는 문자열중 숫자만 추출하여 순서대로 자연수를 출력
 */
public class NumberExtraction {

    public int solution1(String str) {
        int answer = 0;
        for(char c : str.toCharArray()) {
            if(c >= 48 && c <= 57) {
                answer = answer*10+(c-48);
            }
        }

        return answer;
    }

    public int solution2(String str) {
        String answer = "";
        for(char c : str.toCharArray()) {
            if(Character.isDigit(c)) {
                answer += c;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.print(new NumberExtraction().solution2(s));
    }
}
