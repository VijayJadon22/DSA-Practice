import java.util.*;

class StackArray {
    int data[];
    int nextIndex;

    StackArray() {
        data = new int[5];
        nextIndex = 0;
    }

    void push(int x) {
        if (nextIndex == data.length) {
            throw new StackOverflowError();
        } else if (nextIndex < data.length) {
            data[nextIndex++] = x;
        } else {
            System.out.println("Stack is full");
        }
    }

    int pop() {
        if (nextIndex == 0) {
            throw new EmptyStackException();
        } else {
            nextIndex--;
            int res = data[nextIndex];
            return res;
        }
    }

    int peek() {
        if (nextIndex == 0) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return data[nextIndex - 1];
        }
    }

    int size() {
        return nextIndex;
    }

    boolean isEmpty() {
        if (nextIndex == 0) {
            return true;
        } else {
            return false;
        }
    }

    void printStack() {
        if (nextIndex > 0) {
            for (int i = 0; i < nextIndex; i++) {
                System.out.print(data[i] + " ");
            }
        } else {
            System.out.println("stack is empty");
        }
    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackLinkedList {
    private Node head;

    StackLinkedList() {
        head = null;
    }

    // Method to push an element onto the stack
    void push(int element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
    }

    

    // Method to pop an element from the stack
    int pop() {
        if (head != null) {
            int poppedData = head.data;
            head = head.next;
            return poppedData;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

}

public class App {
    public static void main(String[] args) {
        StackArray stack = new StackArray();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // stack.push(40);
        // stack.push(50);
        // stack.push(60);
        stack.pop();
        // stack.printStack();
        // System.out.println(stack.pop());
        // System.out.println(stack.peek());
        // System.out.println(stack.isEmpty());
        // System.out.println(stack.size());

    }
}
