package string;

import java.util.Scanner;

/**
 * 가장 짧은 문자거리 문제
 * 문자열 s와 문자 c가 주어질경우 각 문자가 문자 c와 떨어진 최소거리를 출력
 */
public class ShortCharacterDistance {

    public int[] solution(String s, char c) {
        int[] answer = new int[s.length()];

        int p = 1000;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for(int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) == c) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ShortCharacterDistance scd = new ShortCharacterDistance();

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char c = sc.next().charAt(0);
        for(int n : scd.solution(s, c)) {
            System.out.print(n + " ");
        }
    }
}
