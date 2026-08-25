import java.util.Scanner;

public class CircularQueue {

    int size, front, rear;
    int[] cqueue;

    //constructor
    public CircularQueue(int capacity) {
        size = capacity;
        cqueue = new int[size];
        front = -1;
        rear = -1;
    }

    //Insert
    void cqinsert(int val) {
        if (front == (rear + 1) % size) {
            System.out.println("Overflow");
        }
        else {
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
                cqueue[rear] = val;
            }
            else {
                rear = (rear + 1) % size;
                cqueue[rear] = val;
            }
            System.out.println("Inserted: " + val);
        }
    }

    //Delete
    void cqdelete() {
        if (front == -1) {
            System.out.println("Underflow");
        }
        else {
            System.out.println("Deleted: " + cqueue[front]);
            if (front == rear) {
                front = -1;
                rear = -1;
            }
            else {
                front = (front + 1) % size;
            }
        }
    }

    //Display
    void cqdisplay() {

        if (front == -1) {
            System.out.println("Queue is empty");
        }
        else {
            System.out.println("Queue elements are:");
            int i = front;
            while (i != rear) {
                System.out.print(cqueue[i] + " ");
                i = (i + 1) % size;
            }
            System.out.println(cqueue[rear]);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int n = sc.nextInt();
        CircularQueue q = new CircularQueue(n);

        int ch, val;

        System.out.println("\nSelect from the listed options-");

        while(true){
            System.out.println("\n--- MENU ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.println("Enter element to be inserted:");
                    val = sc.nextInt();
                    q.cqinsert(val);
                    break;

                case 2:
                    q.cqdelete();
                    break;

                case 3:
                    q.cqdisplay();
                    break;

                case 4:
                    System.out.println("Program Terminated !!");
                    sc.close();
                    return;

                default:
                    System.out.println("OUTSIDE CASE VALUE");
            }
        }
    }
}