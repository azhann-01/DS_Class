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
        
        void display(){
            Node temp = head;
            if (temp==null){
                System.out.println("Empty DLL");
            } else{
                System.out.println("List on forward direction: ");
                while(temp.right!=null){
                    System.out.println(temp.data + "-->");
                    temp=temp.right;
                }
                System.out.println(temp.data + "-->" + "NULL");
                System.out.println("List on backward direction: ");
                while(temp!=null){
                    System.out.println(temp.data + "-->");
                    temp=temp.left;
                }
                System.out.println("NULL");
            }
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList list = new DoubleLinkedList();
        System.out.println("Enter your choice");
        int choice;
        do{
        System.out.println("1. Create List");
        System.out.println("2. Display list");
        System.out.println("3. Exit");

        choice = sc.nextInt();

        switch(choice){
            case 1:
                list.CreateList();
                System.out.println("DLL Created");
                break;
            case 2:
                list.display();
                break;
            case 3:
                System.out.println("Program Terminated!!");
                break;
            default:
            System.out.println("Invalid Choice");
            break;
        }
        } while(choice!=3);
        sc.close();
    }
}