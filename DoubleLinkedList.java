import java.util.*;

class DoubleLinkedList {
    class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node head = null;

    void CreateList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of nodes: ");
        int n = sc.nextInt();
        Node temp = null;
        for (int i = 1; i <= n; i++) {
            System.out.println("enter data: ");
            int v = sc.nextInt();
            Node newnode = new Node(v);
            if (head == null) {
                head = temp = newnode;
            } else {
                temp.right = newnode;
                newnode.left = temp;
                temp = newnode;
            }
        }
    }

    void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Empty DLL");
        } else {
            System.out.println("List on forward direction: ");
            while (temp.right != null) {
                System.out.print(temp.data + "<-->");
                temp = temp.right;
            }
            System.out.println(temp.data + "<-->" + "NULL");
            System.out.println("--------------------------");
            System.out.println("List on backward direction: ");
            while (temp != null) {
                System.out.print(temp.data + "<-->");
                temp = temp.left;
            }
            System.out.println("NULL");
        }
    }

    void insert_beg() {
        System.out.println("enter data");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        Node newnode = new Node(v);
        if (head == null) {
            head = newnode;
        } else {
            newnode.right = head;
            head.left = newnode;
            head = newnode;
        }
    }

    void insert_end() {
        Node temp = null;
        System.out.println("enter data");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        Node newnode = new Node(v);
        if (head == null) {
            head = newnode;
        } else {
            temp = head;
            while (temp.right != null) {
                temp = temp.right;
            }
            temp.right = newnode;
            newnode.left = temp;
        }
    }

    void insert_inbtw() {
        Node temp = head;
        System.out.println("enter data");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        Node newnode = new Node(v);
        if (head == null) {
            head = newnode;
        } else {
            System.out.println("enter data after which you want to input: ");
            int p = sc.nextInt();
            while (temp != null && temp.data != p) {
                temp = temp.right;
            }
            if (temp == null) {
                System.out.println("Data not found");
                return;
            }
            newnode.right = temp.right;
            newnode.left = temp;
            temp.right = newnode;
            newnode.right.left = newnode;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList list = new DoubleLinkedList();
        System.out.println("Enter your choice");
        int choice;
        do {
            System.out.println("1. Create List");
            System.out.println("2. Display list");
            System.out.println("3. Insert at beginning");
            System.out.println("4. Insert at end");
            System.out.println("5. Insert in between");
            System.out.println("6. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    list.CreateList();
                    System.out.println("DLL Created");
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    list.insert_beg();
                    System.out.println("Value inserted in the beginning");
                    break;
                case 4:
                    list.insert_end();
                    System.out.println("Value inserted in the end");
                    break;
                case 5:
                    list.insert_inbtw();
                    System.out.println("Value inserted in between");
                    break;
                case 6:
                    System.out.println("Program Terminated!!");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (choice != 6);
        sc.close();
    }
}