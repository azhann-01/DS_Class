import java.util.*;

class DoubleLinkedList{
    class Node{
        Node left;
        Node right;
        int data;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
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
                temp.right=newnode;
                newnode.left=temp;
                temp=newnode;
            }
        }
    }
    }
}