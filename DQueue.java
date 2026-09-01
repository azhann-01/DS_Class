import java.util.Scanner;

public class DQueue {

    int size, front, rear;
    int[] dq;

    //constructor
    public DQueue(int size) {
        this.size=size;
        dq = new int[size];
        front = -1;
        rear = -1;
    }

    //Insert
    void DqInsFront(int val) {
        if (front == 0) {
            System.out.println("Overflow");
        }
        else if(front == -1){
            rear = front = 0;
            dq[front] = val;
        } else{
            front--;
            dq[front] = val;
        }
        System.out.println("Inserted: " + val);
    }

    void DqInsRear(int val) {
        if (rear == size-1) {
            System.out.println("Overflow");
        }
        else if(rear == -1){
            front = rear = 0;
            dq[rear] = val;
        } else{
            rear++;
            dq[rear] = val;
        }
        System.out.println("Inserted: " + val);
    }

    //Delete
    void DqDelFront() {
        if (front == -1) {
            System.out.println("Underflow");
        }
        System.out.println("Deleted from Front: " + dq[front]);
        if (front == rear) {
            front = -1;
            rear = -1;
        } 
        else{
            front++;
        }
    }

    void DqDelRear() {
        if (front == -1) {
            System.out.println("Underflow");
        }
        System.out.println("Deleted from Rear: " + dq[front]);
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        else{
            rear--;
        }
    }

    //Display
    void DqInsdisplay() {

        if (front == -1) {
            System.out.println("Queue is empty");
        }
        else {
            System.out.println("Queue elements are:");
            int i = front;
            while (i != rear) {
                System.out.print(dq[i] + " ");
                i = (i + 1) % size;
            }
            System.out.println(dq[rear]);
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