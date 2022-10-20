package recursive;

public class Subset {
    static int n;
    static int[] check;

    public void DFS(int L) {
        if(L == n+1) {
            String temp = "";
            for(int i = 0; i <= n; i++) {
                if(check[i] == 1) {
                    temp += (i + " ");
                }
            }
            if(temp.length() > 0) {
                System.out.println(temp);
            }
        } else {
            check[L] = 1;
            DFS(L+1);
            check[L] = 0;
            DFS(L+1);
        }
    }

    public static void main(String[] args) {
        Subset s = new Subset();
        n = 3;
        check = new int[n+1];
        s.DFS(1);
    }
}
