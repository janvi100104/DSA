import java.util.*;
public class Prac1 {
    private Stack<Integer> first;
    private Stack<Integer> second;
public Prac1(){
    first = new Stack<>();
    second = new Stack<>();
}
public void add(int data){
    first.push(data);
}
public int remove(){
    
        while(!first.isEmpty()){
            second.push(first.pop());
        }
    int removed = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
  
}
public boolean isEmpty(){
    return first.isEmpty();}
}
