package hash;

import java.util.HashMap;
import java.util.Scanner;

public class ClassLeaderVote {

    public Character solution(String s) {
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()) {
            int value = map.get(key);
            if(value > max) {
                max = value;
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = sc.next();

        System.out.println(new ClassLeaderVote().solution(s));
    }
}
