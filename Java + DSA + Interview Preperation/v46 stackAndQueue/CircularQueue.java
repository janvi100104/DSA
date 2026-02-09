public class CircularQueue {
     private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end= 0;
    int front=0;
    int size=0;
    public CircularQueue(){
        this(DEFAULT_SIZE);   
    }   
    public CircularQueue(int size) {
        this.data = new int[size];
    }
     public boolean isFull()
{
    return size == data.length ;
}  
public boolean isEmpty(){
    return size == 0;
}
public boolean insert(int item){
    if(isFull()){
        return false;
    }
    data[end] = item;
    end = (end + 1) % data.length;
    size++;
    return true;
}
public int remove() {
    if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
    }
    int removed = data[front];
    front = (front + 1) % data.length;
    size--;
    return removed;
}
public void display(){
if(isEmpty()){
    System.out.println("Queue is empty");
    return;

}
int i = front;
do{
    System.out.println(data[i] + " ");
    i = (i + 1) % data.length;
}while(i != end);

}
    public static void main(String[] args) {
        
    }
}
