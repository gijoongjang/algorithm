package string;

import java.util.Scanner;

/**
 * --문제--
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개
 * 존재하는지 알아내는 프로그램을 작성하세요. 대소문자를 구분하지 않습니다.
 * 문자열의 길이는 100을 넘지 않습니다.
 *
 * --입력예제--
 * Computercooler
 * c
 * --출력예제--
 * 2
 */
public class FindLetters {

    public int solution(String s, char c) {
        int answer = 0;
        s = s.toUpperCase();
        c = Character.toUpperCase(c);

        for(char ch : s.toCharArray()) {
            if(ch == c) answer++;
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char c = sc.next().charAt(0);

        System.out.print(new FindLetters().solution(s, c));
    }
}
