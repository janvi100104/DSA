public class RevLL1 {
     private  class Node{
        int value;
        Node next;
        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
        Node(int value){
            this.value = value;
            this.next = null;
        }
    }
    Node head = null;
    Node tail = null;
    int size =0;

    public void Display(){
        Node temp = head;
        if( head == null){
            System.out.println("LL is empty");
            return;
        }
        while(temp != null){
        System.out.print(temp.value + " ->");
        temp = temp.next;
        }
    }

    public void insertFirst(int value){
        Node temp = new Node(value);
        temp.next = head;head = temp;
        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int value){
        Node temp = new Node(value);
        if(tail == null){
            insertFirst(value);
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = new Node(value);
        tail = temp.next;

        size++;
    }

    public void insert(int value, int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }
    public static void main(String[] args) {
        RevLL1 a = new RevLL1();
        
        Node first =new Node(10);
        a.head= first;
        Node second = new Node(20);
        Node third = new Node(30);
        a.insertFirst(2);
        a.insertLast(40);
        a.insert(3, 4);
        first.next= second;
        second.next= third;
        a.Display();


    }
}
