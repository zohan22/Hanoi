package org.example;

public class ListStack implements IStack{
    Node top;


    @Override
    public int size() {
        int size = 0;
        if(isEmpty()){
            return 0;
        } else {
            Node current = top;
            while(current != null){
                size++;
                current = current.next;
            }
            return size;
        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void push(int d) {
        Node current = new Node(d);
        current.next = top;
        top = current;
    }

    @Override
    public int top() {
        if(isEmpty()) {
            System.out.println("Stack is empty, can't read top");
        }
        return (int) top.data;
    }

    @Override
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty, can't be extracted");
        }
        int aux = (int) top.data;
        top = top.next;
        return aux;
    }
}
