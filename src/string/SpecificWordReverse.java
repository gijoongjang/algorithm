package string;

import java.util.Scanner;

/**
 * 특정 문자 뒤집기
 * 영어 알파벳만 뒤집고 특수문자는 그대로
 */
public class SpecificWordReverse {

    public String solution(String str) {
        String answer = "";

        char[] arr = str.toCharArray();

        int left = 0;
        int rigth = str.length()-1;

        while(left < rigth) {
            if(!Character.isAlphabetic(arr[left])) {
                left++;
            } else if(!Character.isAlphabetic(arr[rigth])){
                rigth--;
            } else {
                char temp = arr[left];
                arr[left] = arr[rigth];
                arr[rigth] = temp;
                left++;
                rigth--;
            }
        }

        answer = String.valueOf(arr);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(new SpecificWordReverse().solution(s));
    }
}
