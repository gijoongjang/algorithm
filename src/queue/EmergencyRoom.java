package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Patient {
    int index;
    int priority;

    public Patient(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}

public class EmergencyRoom {

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Patient> queue = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            queue.offer(new Patient(i, arr[i]));
        }

        while(!queue.isEmpty()) {
            Patient temp = queue.poll();
            for(Patient p : queue) {
                if(temp.priority > p.priority) {
                    queue.offer(temp);
                    temp = null;
                    break;
                }
            }

            if(temp != null) {
                answer++;
                if(temp.index == m) return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(new EmergencyRoom().solution(n, m, arr));
    }
}
