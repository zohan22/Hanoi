package org.example;

public class Hanoi {
    private int steps = 0;

    public void hanoi(int disk, ListStack A, ListStack B, ListStack C, String a, String b, String c) {
        if (disk == 1) {
            int d = A.pop();
            C.push(d);
            steps++;
            System.out.println("Move disk " + d + " from " + a + " to " + c);
            System.out.println("Step " + steps + ":");
            printStack(A, B, C);
        } else {
            hanoi(disk - 1, A, C, B, a, c, b);
            int d = A.pop();
            C.push(d);
            steps++;
            System.out.println("Move disk " + d + " from " + a + " to " + c);
            System.out.println("Step " + steps + ":");
            printStack(A, B, C);
            hanoi(disk - 1, B, A, C, b, a, c);
        }
    }


    public void printStack(ListStack towerA, ListStack towerB, ListStack towerC) {
        System.out.println("Tower A: " + stackToString(towerA));
        System.out.println("Tower B: " + stackToString(towerB));
        System.out.println("Tower C: " + stackToString(towerC));
        System.out.println("--------------------");
    }


    public String stackToString(ListStack stack) {
        StringBuilder result = new StringBuilder();
        Node current = stack.top;
        while (current != null) {
            result.insert(0, current.data + " -> ");
            current = current.next;
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 4);
        }
        return result.toString();
    }
}
