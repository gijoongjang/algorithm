package recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class CalfSearch {
    int[] distance = {1, -1, 5};
    int[] checked;
    Queue<Integer> queue = new LinkedList<>();
    public int BFS(int s, int e) {
        checked = new int[10001];

        queue.offer(s);
        checked[s] = 1;

        int level = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i = 0; i < len; i++) {
                int node = queue.poll();
                for(int d : distance) {
                    int newNode = node+d;
                    if(newNode == e) return level+1;
                    if(newNode >= 1 && newNode <= 10000 && checked[newNode] != 1) {
                        queue.offer(newNode);
                        checked[newNode] = 1;
                    }
                }
            }

            level++;
        }

        return -1;
    }

    public static void main(String[] args) throws Exception {
        CalfSearch cs = new CalfSearch();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        System.out.println(cs.BFS(s, e));
    }
}
