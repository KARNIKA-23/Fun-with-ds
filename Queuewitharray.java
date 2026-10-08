class Queue{
    int size;
    int[] arr;
    int front;
    int rear;
    Queue(int size){
        this.size=size;
        this.front=-1;
        this.rear=-1;
        this.arr=new int[size];
    }
    void enqueue(int data){
        if(rear==size-1){
            System.out.println("overflow");
            return;
        }
        if(front==-1){
            front=0;
            
        }
        rear++;
        arr[rear]=data;
        
    }
    void dequeue(){
        if(front==-1||front>rear){
            System.out.println("underflow");
            return;
        }
        front++;
    }
    void peek(){
        if(front==-1||front>rear){
            System.out.println("underflow");
            return;
        }
        System.out.println(arr[front]);
    }
    void display(){
        if(front==-1||front>rear){
            System.out.println("underflow");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }
}
public class Queuewitharray{
    public static void main(String[] args){
        Queue q=new Queue(5);
        q.enqueue(9);
        q.enqueue(10);
        q.enqueue(7);
        q.display();
        q.dequeue();
        q.display();
    }
    
}