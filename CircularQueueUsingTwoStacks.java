import java.util.Scanner;

public class CircularQueueUsingTwoStacks {

    int[] queue;
    int front = -1, rear = -1;
    int size;

    int[] stack1;
    int top1 = -1;

    int[] stack2;
    int top2 = -1;

    CircularQueueUsingTwoStacks(int size) {
        this.size = size;

        queue = new int[size];
        stack1 = new int[size];
        stack2 = new int[size];
    }

    // Insert into Circular Queue
    void insert(int value) {

        // queue full
        if ((rear + 1) % size == front) {
            System.out.println("Queue Overflow");
            return;
        }

        // first element
        if (front == -1) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        queue[rear] = value;

        System.out.println(value + " inserted");
    }

    // Circular Queue -> Stack 1
    void queueToStack1() {

        if (front == -1) {
            return;
        }

        int i = front;

        while (true) {
            stack1[++top1] = queue[i];

            if (i == rear)
                break;

            i = (i + 1) % size;
        }
    }

    // Stack 1 -> Stack 2
    void stack1ToStack2() {

        if (top2 == -1) {

            while (top1 != -1) {
                stack2[++top2] = stack1[top1--];
            }
        }
    }

    // Display Stack 2
    void display() {

        System.out.print("Elements: ");

        while (top2 != -1) {
            System.out.print(stack2[top2--] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CircularQueueUsingTwoStacks q = new CircularQueueUsingTwoStacks(5);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Insert elements into Circular Queue
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            q.insert(sc.nextInt());
        }

        // Queue -> Stack 1
        q.queueToStack1();

        // Stack 1 -> Stack 2
        q.stack1ToStack2();

        // Display by popping Stack 2
        q.display();

        sc.close();
    }
}