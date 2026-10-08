class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class insert_position{
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
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void insertpos(int data,int pos){
        Node newnode=new Node(data);
        if(pos==1){
            newnode.next=head;
            head=newnode;
            return;
        }
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            if(temp==null){
                System.out.println("invalid position");
                return;
            }
            temp=temp.next;
        }
        if(temp==null){
                System.out.println("invalid position");
                return;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public static void main(String[] args){
        insert_position list=new insert_position();
        list.insert(8);
        list.insert(9);
        list.insert(11);
        list.insert(12);
        list.display();
        list.insertpos(10,3);
        list.display();
        
    }
}