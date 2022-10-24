package recursive;

import java.util.LinkedList;
import java.util.Queue;

public class TreeEndNodeShortestRoute {
    Node root;
    public int BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int level = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i = 0; i < len; i++) {
                Node node = queue.poll();
                if(node.lt == null && node.rt == null) return level;
                if(node.lt != null) queue.offer(node.lt);
                if(node.rt != null) queue.offer(node.rt);
            }
            level++;
        }

        return -1;
    }

    public static void main(String[] args) {
        TreeEndNodeShortestRoute tree = new TreeEndNodeShortestRoute();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));
    }
}
