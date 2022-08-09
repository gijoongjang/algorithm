package string;

import java.util.Scanner;

/**
 * 문장 속 단어 문제
 * 문장 속에서 가장 긴 단어 출력
 * 단, 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽 위치한 단어를 출력
 */
public class WordInSentence {

    public String solution1(String str) {
        String answer = "";

        int max = Integer.MIN_VALUE;

        String[] arr = str.split(" ");
        for(String s : arr) {
            int length = s.length();
            if(length > max) {
                max = length;
                answer = s;
            }
        }

        return answer;
    }

    public String solution2(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        int position;
        while((position=str.indexOf(' ')) != -1) {
            String temp = str.substring(0, position);
            int length = temp.length();
            if(length > max) {
                max = length;
                answer = temp;
            }
            str = str.substring(position+1);
        }

        if(str.length() > max) answer = str;

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.print(new WordInSentence().solution1(s));
//        System.out.print(new WordInSentence().solution2(s));
    }
}
