import java.util.*;
class SLinkedList{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head=null;

    void CreateList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of nodes: ");
        int n = sc.nextInt();
        Node temp=null;
        for(int i=1; i<=n; i++){
            System.out.println("enter data: ");
            int v = sc.nextInt();
            Node newnode = new Node(v);
            if(head==null){
                head=temp=newnode;
            } else{
                temp.next=newnode;
                temp=newnode;
            }
        }
    }

    void display(){
        Node p = head;
        if(p==null){
            System.out.println("Sorry, It is empty.");
            return;
        } else{
            while(p!=null){
                System.out.print(p.data +"--->");
                p=p.next;
            }
            System.out.println("NULL");
        }
    }


public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    SLinkedList list = new SLinkedList();
    System.out.println("Enter your choice: ");
    int choice;
    do{
        System.out.println("1. Create List");
        System.out.println("2. Display list");
        System.out.println("3. Exit");

        choice = sc.nextInt();

        switch(choice){
            case 1:
                list.CreateList();
                break;
            case 2:
                list.display();
                break;
            case 3:
                System.out.println("Program exited.");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }while(choice!=3);

    sc.close();
    }
}