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



//Solutions for min stack problem 
class MinStack {
    Stack<Integer> stack;
    int min;

    public MinStack() {
        this.stack = new Stack<>();
        this.min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            min = val;
        } else {
            if (val >= min) {
                stack.push(val);
            } else {
                stack.push(2 * val - min);
                min = val;
            }
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        int top = stack.pop();
        if (top < min) {
            min = 2 * min - top;
        }
    }

    public int top() {
        int top = stack.peek();
        if (top < min) {
            return min;
        } else {
            return top;
        }
    }

    public int getMin() {
        return min;
    }
}


// class Pair{
//     int i;
//     int j;
//     Pair(int i,int j){
//         this.i=i;
//         this.j=j;
//     }
// }
// class MinStack {
//     Stack<Pair> stack;

//     public MinStack() {
//         this.stack=new Stack<>();
//     }
    
//     public void push(int val) {
//         if(stack.isEmpty()){
//             Pair p=new Pair(val,val);
//             stack.push(p);
//         }else{
//             Pair p=stack.peek();
//             int newMin=Math.min(val,p.j);
//             Pair newPair=new Pair(val,newMin);
//             stack.push(newPair);
//         }
//     }
    
//     public void pop() {
//         stack.pop();
//     }
    
//     public int top() {
//         Pair p=stack.peek();
//         return p.i;
//     }
    
//     public int getMin() {
//         Pair p=stack.peek();
//         return p.j;
//     }
// }


// class MinStack {
//     Stack<Integer> stack;
//     Stack<Integer> minStack;

//     public MinStack() {
//         this.stack=new Stack<>();
//         this.minStack=new Stack<>();
//     }
    
//     public void push(int val) {
//         stack.push(val);
//         if(minStack.isEmpty()){
//             minStack.push(val);
//         }else{
//             if(minStack.peek()<val){
//                 minStack.push(minStack.peek());
//             }else{
//                 minStack.push(val);
//             }
//         }
//     }
    
//     public void pop() {
//         stack.pop();
//         minStack.pop();
//     }
    
//     public int top() {
//         int c=stack.peek();
//         return c;
//     }
    
//     public int getMin() {
//         int c=minStack.peek();
//         return c;

//     }
// }


//product of array except self
public int[] productExceptSelf(int[] nums) {
    
        int n=nums.length;
        int prefixProd[]=new int[n];
        int suffixProd[]=new int[n];

        prefixProd[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixProd[i]=prefixProd[i-1]*nums[i];
        }

        suffixProd[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffixProd[i]=nums[i]*suffixProd[i+1];
        }

        int res[]=new int[n];
        res[0]=suffixProd[1];
        res[n-1]=prefixProd[n-2];
        for(int i=1;i<n-1;i++){
            res[i]=prefixProd[i-1]*suffixProd[i+1];
        }

        return res;

    }


// Valid palnidrome
public boolean isPalindrome(String s) {


    int i=0;
        int j=s.length()-1;

        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++; j--;
        }
        return true;

        int count[]=new int[26];
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String newStr=sb.toString();
        int i=0;
        int j=newStr.length()-1;
        while(i<j){
            if(newStr.charAt(i)!=newStr.charAt(j)){
                return false;
            }
            i++; j--;
        }

        return true;

}

