
public class stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public stack(){
        this(DEFAULT_SIZE);   
    }
    public stack(int size) {
        this.data = new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }
    public boolean isFull()
{
    return ptr == data.length - 1;
}  
public boolean isEmpty(){
    return ptr == -1;
}
  public static void main(String[] args) {
       stack stack = new stack(5);
         stack.push(1); 
            stack.push(2);

            stack.push(3);
            stack.push(4);
        
            stack.push(5);
            System.out.println(stack.pop());


    }
}
