import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class CLList
{
    Node head;
    public void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            newnode.next=head;
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=head;
    }
    public void display(){
        Node temp=head;
        do{
            System.out.print(temp.data+"->");
            temp=temp.next;
        }while(temp!=head);
    }
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 CLList list=new CLList();
	 int n=sc.nextInt();
	 for(int i=0;i<n;i++){
	     int data=sc.nextInt();
	     list.insert(data);
	 }
	 list.display();
	}
}