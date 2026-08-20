import java.util.Scanner;

public class ReverseQueueUsingStack {

    static class Stack {
        int stack[];
        int top;
        int size;

        Stack(int capacity) {
            size = capacity;
            stack = new int[size];
            top = -1;
        }

        void push(int val) {
            if (top == size - 1) {
                System.out.println("Stack Overflow");
            } else {
                stack[++top] = val;
            }
        }

        int pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return stack[top--];
        }

        boolean isEmpty() {
            return top == -1;
        }
    }

    static class Queue {
        int queue[];
        int size;
        int front, rear;

        Queue(int capacity) {
            size = capacity;
            queue = new int[size];
            front = -1;
            rear = -1;
        }

        void insert(int val) {
            if (rear == size - 1) {
                System.out.println("Queue Overflow");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = val;
            System.out.println(val + " inserted");
        }

        void display() {
            if (front == -1) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }

        void reverse() {
            if (front == -1) {
                System.out.println("Queue is empty");
                return;
            }

            Stack s = new Stack(size);

            for (int i = front; i <= rear; i++) {
                s.push(queue[i]);
            }

            for (int i = front; i <= rear; i++) {
                queue[i] = s.pop();
            }

            System.out.println("Queue reversed successfully");
            display();
        }
    }

    public static void main(String args[]) {

        Queue q = new Queue(5);
        Scanner sc = new Scanner(System.in);

        char n;

        do {
            System.out.println("\n1. insert");
            System.out.println("2. reverse()");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    q.insert(val);
                    break;
                case 2:
                    q.reverse();
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            System.out.print("Do you want to continue [y/n]: ");
            n = sc.next().charAt(0);

        } while (n == 'y' || n == 'Y');

        sc.close();
    }
}