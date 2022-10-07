package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
    public int x;
    public int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //오름차순
    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) {
            return this.y - o.y;
        } else {
            return this.x - o.x;
        }
    }
}

public class CoordinateSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Point> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x, y));
        }

        Collections.sort(arr);

        for(Point p : arr) {
            System.out.println(p.x + " " + p.y);
        }
    }
}
