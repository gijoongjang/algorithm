package string;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 단어 뒤집기 문제
 */
public class WordReverse {

    public ArrayList<String> solution1(int n, String[] arr) {
        ArrayList<String> answer = new ArrayList<>();
        for(String s : arr) {
            String temp = new StringBuilder(s).reverse().toString();
            answer.add(temp);
        }

        return answer;
    }

    public ArrayList<String> solution2(int n, String[] arr) {
        ArrayList<String> answer = new ArrayList<>();
        for(String s : arr) {
            char[] cArr = s.toCharArray();
            int lt = 0, rt = s.length()-1;
            while(lt < rt) {
                char temp = cArr[lt];
                cArr[lt] = cArr[rt];
                cArr[rt] = temp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(cArr);
            answer.add(tmp);
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
        for(String s : wr.solution2(n, arr)){
            System.out.println(s);
        }
    }
}
