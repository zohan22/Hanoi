package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To the towers of Hanoi!");
        try {
            int numberOfDisks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of disks: "));
            solve(numberOfDisks);
        } catch (NumberFormatException e) {
            System.err.println("Please enter a valid number.");
        }
    }

    public static void solve(int n){
        String a = "TOWER A";
        String b = "TOWER B";
        String c = "TOWER C";
        Hanoi ha = new Hanoi();
        ListStack tower1 = new ListStack();
        ListStack tower2 = new ListStack();
        ListStack tower3 = new ListStack();

        for(int i=n; i>0; i--) {
            tower1.push(i);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>");
        System.out.println("Initial State of the towers");
        ha.printStack(tower1, tower2, tower3);

        ha.hanoi(n, tower1, tower2, tower3,a,b,c);

        System.out.println("Final State of the towers");
        ha.printStack(tower1, tower2, tower3);
        System.out.println("<<<<<<<<<<<<<<<<<<<<");
    }
}