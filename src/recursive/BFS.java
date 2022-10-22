package recursive;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    Node root;
    public void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();
            System.out.print(level+"level : ");
            for(int i = 0; i < len; i++) {
                Node node = queue.poll();
                System.out.print(node.data + " ");
                if(node.lt != null) queue.offer(node.lt);
                if(node.rt != null) queue.offer(node.rt);
            }
            level++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BFS tree = new BFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}
