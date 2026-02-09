public class Queue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end= 0;
    public Queue(){
        this(DEFAULT_SIZE);   
    }   
    public Queue(int size) {
        this.data = new int[size];
    }
     public boolean isFull()
{
    return end == data.length ;
}  
public boolean isEmpty(){
    return end == 0;
}
public boolean insert(int item){
    if(isFull()){
        return false;
    }
    data[end] = item;
    end++;
    return true;
}
public int remove() {
    if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
    }
    int removed = data[0];
    //shift the items to left by one
    for(int i=1;i<end;i++){
        data[i-1] = data[i];
    }
    end--;  
    return removed;
}
    public static void main(String[] args) {
        
    }
}
