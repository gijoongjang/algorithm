package hash;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

    public String solution(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char key : s2.toCharArray()) {
            if(!map.containsKey(key)) {
                return "NO";
            }

            if(map.get(key) == 1) {
                map.remove(key);
            } else {
                map.replace(key, map.get(key)-1);
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(new Anagram().solution(s1, s2));
    }
}
