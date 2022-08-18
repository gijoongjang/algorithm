package string;

import java.util.Scanner;

/**
 * 문자열 압축 문제
 * 문자열을 입력 받아 같은 문자가 연속으로 나오는 경우 문자 오른쪽에 반복 회수 표기 하여 문자열 압축
 * 반복횟수 1인 경우는 생략한다.
 */
public class StringCompression {

    public String solution(String s) {
        String answer = "";
        s = s+" ";
        int cnt = 1;
        for(int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                cnt++;
            } else {
                answer += s.charAt(i);
                if(cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(new StringCompression().solution(s));
    }
}
