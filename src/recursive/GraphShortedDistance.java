package recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class GraphShortedDistance {

    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] checked, distance;

    static StringTokenizer st;
    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        checked[v] = 1;
        distance[v] = 0;
        queue.offer(v);

        while(!queue.isEmpty()) {
            int curVertex = queue.poll();
            for(int next : graph.get(curVertex)) {
                if(checked[next] == 0) {
                    checked[next] = 1;
                    queue.offer(next);
                    distance[next] = distance[curVertex]+1;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        GraphShortedDistance sd = new GraphShortedDistance();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        checked = new int[n+1];
        distance = new int[n+1];
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }

        sd.BFS(1);
        for(int i = 2; i <= n; i++) {
            System.out.println(i+" : "+distance[i]);
        }
    }
}
