package string;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 단어 뒤집기 문제
 */
public class WordReverse {

    public ArrayList<String> solution(int n, String[] arr) {
        ArrayList<String> answer = new ArrayList<>();
        for(String s : arr) {
            String temp = new StringBuilder(s).reverse().toString();
            answer.add(temp);
        }

        return answer;
    }

    public static void main(String[] args) {
        WordReverse wr = new WordReverse();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for(String s : wr.solution(n, arr)){
            System.out.println(s);
        }
    }
}
