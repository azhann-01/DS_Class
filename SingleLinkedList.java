import java.util.*;
class SingleLinkedList{
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

    void insert_beg(){
        System.out.println("enter data");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        Node newnode = new Node(v);
        newnode.next=head;
        head=newnode;
    }

    void insert_end(){
        Node temp = null;
        System.out.println("enter data");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        temp = head;
        Node newnode = new Node(v);
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    void insert_inbtw(){
        Scanner sc = new Scanner(System.in);
        Node temp = head;
        System.out.println("enter data");
        int v = sc.nextInt();
        Node newnode = new Node(v);
        System.out.println("enter data after which you want to insert: ");
        int clc = sc.nextInt();
        while(temp.data!=clc){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    SingleLinkedList list = new SingleLinkedList();
    System.out.println("Enter your choice: ");
    int choice;
    do{
        System.out.println("1. Create List");
        System.out.println("2. Display list");
        System.out.println("3. Insert at beginning");
        System.out.println("4. Insert at end");
        System.out.println("5. Insert in between");
        System.out.println("6. Exit");

        choice = sc.nextInt();

        switch(choice){
            case 1:
                list.CreateList();
                break;
            case 2:
                list.display();
                break;
            case 3:
                list.insert_beg(); 
                System.out.println("value inserted.");
                break;
            case 4:
                list.insert_end();
                System.out.println("value inserted.");
                break;
            case 5:
                list.insert_inbtw();
                System.out.println("value inserted in between");
                break;
            case 6:
                System.out.println("Program termminated!!");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }while(choice!=6);

    sc.close();
    }
}