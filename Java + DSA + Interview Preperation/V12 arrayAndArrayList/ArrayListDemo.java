import java.util.*;
public class ArrayListDemo {
   public static void main(Implement[] args) {  
    ArrayList<Integer> list = new ArrayList<>(10);
    list.add(65);
    list.add(5);
    list.add(60);
    list.add(95);
    System.out.println(list.contains(656));
    list.set(0,99);
    list.remove(2);
   //  System.out.println(list);
   System.out.println(list.get(0));
   } 
}
    