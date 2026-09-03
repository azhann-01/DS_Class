import java.util.*;

class Mlinkedlist {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    
    void CreateList() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of nodes: ");
        int n = sc.nextInt();

        Node temp = null;

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter data: ");
            int v = sc.nextInt();

            Node newnode = new Node(v);

            if (head == null) {
                head = temp = newnode;
            } 
            else {
                temp.next = newnode;
                temp = newnode;
            }
        }
    }

    // Display Linked List
    void display() {

        Node p = head;

        if (p == null) {
            System.out.println("Sorry, It is empty.");
            return;
        }

        while (p != null) {
            System.out.print(p.data + "--->");
            p = p.next;
        }

        System.out.println("NULL");
    }

    // Merge two linked lists
    void merge(Mlinkedlist list2) {

        // If first list is empty
        if (head == null) {
            head = list2.head;
            return;
        }

        // If second list is empty
        if (list2.head == null) {
            return;
        }

        Node temp = head;

        // Go to the last node of first list
        while (temp.next != null) {
            temp = temp.next;
        }

        // Connect last node of first list
        // to first node of second list
        temp.next = list2.head;
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Mlinkedlist list1 = new Mlinkedlist();
        Mlinkedlist list2 = new Mlinkedlist();

        System.out.println("Enter elements for First Linked List:");
        list1.CreateList();

       


        System.out.println("\nEnter elements for Second Linked List:");
        list2.CreateList();
 System.out.println("\nFirst Linked List:");
        list1.display();
        System.out.println("\nSecond Linked List:");
        list2.display();


        // Merge list2 into list1
        list1.merge(list2);

        System.out.println("\nAfter Merging:");
        list1.display();

        sc.close();
    }
}