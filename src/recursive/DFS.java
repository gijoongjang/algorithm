package recursive;

class Node {
    int data;
    Node lt, rt;
    public Node(int value) {
        data = value;
        lt = rt = null;
    }
}

public class DFS {
    Node root;

    public void preOrder(Node root) {
        if(root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.lt);
        preOrder(root.rt);
    }

    public void inOrder(Node root) {
        if(root == null) return;

        inOrder(root.lt);
        System.out.print(root.data + " ");
        inOrder(root.rt);
    }

    public void postOrder(Node root) {
        if(root == null) return;

        postOrder(root.lt);
        postOrder(root.rt);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        DFS tree = new DFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
    }
}
