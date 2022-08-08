package string;

import java.util.Scanner;

/**
 * 대소문자 변환 문제
 */
public class CharacterConversion {

    public String solution(String str) {
        String answer = "";

        for(char c : str.toCharArray()) {
            if(Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            } else {
                answer += Character.toLowerCase(c);
            }

            // ASCII 코드로도 가능
            // 65 ~ 90 대문자
            // 97 ~ 122 소문자
            //if(c >= 97 && c <= 122) answer += (char)(c-32);
            //else answer += (char)(c+32);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.print(new CharacterConversion().solution(s));
    }
}
