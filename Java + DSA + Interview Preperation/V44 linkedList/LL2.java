public class LL2 {
    class Node {
        int value ;
        Node next;
        Node prev;
        Node(int value){
            this.value = value;
            
        }
        Node (int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    Node head = null;
    Node tail = null;   
    int size =0;
     public void insertFirst(int value ){
        Node temp = new Node (value);
        temp.next=head;
        temp.prev = null;
        if(head!=null){

            head.prev=temp;
        }
        head = temp;
        if(tail == null){
            tail=temp;
        }
        size++;
     }
     
     public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.value + "->");
            last=node;
            node = node.next;
        }
    System.out.println("End");
    // System.out.println("REVERSE");
    // while(last != null){
    //     System.out.print(last.value + "->");
    //     last= last.prev;
    // }
     }
     public void insert(int after, int val){
        Node p = find(after);
        if(p == null){
            System.out.println("Does not exist");

        }
        Node node = new Node(val);
        node.next= p.next;
        p.next=node;
        node.prev=p;
        if(node.next != null){
            node.next.prev = node;
        }
     }

      public Node find(int value) {
     Node node = head;
     while(node!=null){
        if(node.value==value){
return node;
        }
        node = node.next;
     }
     return null;
    }

     public void insertLast(int value){
         Node temp = new Node(value);
         Node node = head;
         temp.next= null;
            if(head == null){
                temp.prev = null;
                head = temp;
                return;
            }
        while (node.next!=null) {
            node=node.next;
        }
        
        node.next= temp;
        temp.prev=node;
        
        
     }
    public static void main(String[] args) {
       LL2 list = new LL2();
       list.insertFirst(4);
       list.insertFirst(5);
       list.insertLast(0);
       list.insert(5, 100);
       list.display(); 
    }
    
}
