import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
public class DSLidrevddelete{
    Node head;
    public void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public void revdisplay(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.prev;
        }
    }
    public void delete(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        head=head.next;
    }
    public void deleteend(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            
        }
        temp.prev.next=null;
    }
    public void insertbeg(int data){
        Node newnode=new Node(data);
        newnode.next=head;

        if(head != null){
           head.prev=newnode;
}

        head=newnode;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        DSLidrevddelete list=new DSLidrevddelete();
        int node=sc.nextInt();
        for(int i=1;i<=node;i++){
            int data=sc.nextInt();
            list.insert(data);
        }
        list.display();
        System.out.println();

        list.insertbeg(9);
     
        list.display();
        System.out.println();

        list.revdisplay();
        
    }
}
