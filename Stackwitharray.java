import java.util.Scanner;
class Stack{
    int size;
    int[] stack;
    int top;
    Stack(int size){
        this.size=size;
        this.stack=new int[size];
        this.top=-1;
    }
    public void push(int data){
        if(top==size-1){
            System.out.println("overflow");
            return;
        }
        top++;
        stack[top]=data;
    }
    public void peek(){
        if(top==-1){
            System.out.println("stack underflow");
            return;
        }
        System.out.println("the peek value"+ stack[top]);
    }
    public void pop(){
         if(top==-1){
            System.out.println("stack underflow");
            return;
        }
        System.out.println("the pop value is"+ stack[top]);
        top--;
    }
    public void display(){
        
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+",,");
        }
    }
}
public class Stackwitharray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Stack s=new Stack(size);
        for(int i=1;i<=size;i++){
            int data=sc.nextInt();
            s.push(data);
        }
        s.display();
        s.pop();
        s.display();
        s.peek();
        s.pop();
        s.pop();
        s.display();
        s.pop();
    }
     
    
}