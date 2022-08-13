package string;

import java.util.Scanner;

/**
 * 중복문자제거 문제
 */
public class DuplicationRemove {

    public String solution(String str) {
        String answer = "";

        for(int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.print(new DuplicationRemove().solution(s));
    }
}
