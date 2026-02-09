

public class Ll1 {
    private class Node{

        private int val;
        private Node next;


        public Node(int val){
            this.val = val;
        }

        public Node (int value, Node next){
            this.val = value;
            this.next = next;
        }
    }

private int size;
private Node head;
private Node tail;
    public Ll1(){
        this.size = 0;
    }
        public void  insertFirst(int value){
            Node node = new Node(value);
            node.next=head;
            head=node;
            if(tail==null){
                tail=head;
            }
            size++;
        }

        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
        }
        
        public void insertLast(int value){
            Node node = new Node(value);
            if(tail == null){
                insertFirst(value);
            }
            tail.next = node;
            tail=node;
            size++; 
        }

        public void insert(int value,int index){
            if(index==0){
                insertFirst(value);
                return;
            }
            if(index==size){
                insertLast(value);
                return;
            }
            Node temp = head;
            for(int i =0;i<index-1;i++){
                temp = temp.next;
            }
            Node node = new Node(value, temp.next);
            temp.next = node;
            size++;
        }
        public int deleteFirst(){
            int val = head.val;
            head = head.next;
            if(head==null){
                tail=null;
            }
            size--;
            return val;
        }

        public Node get(int index){
            Node temp = head ;
            for(int i =0;i<index;i++){
                temp = temp.next;
            }
            return temp;
        }

        public int deleteLast(){
            if(size<=1){
                return deleteFirst();
            }
            Node secondLast = get(size-2);
            int val = tail.val;
            tail = secondLast;
            tail.next = null;
            size--;
            return val;
        }

        public int Delete(int index){
            if(index==0){
                return deleteFirst();
            }
            if(index==size-1){
                return deleteLast();
            }
            Node prev = get (index-1);
            int val = prev.next.val;
            prev.next = prev.next.next;
            size--;
            return val;
        }

    public static void main(String[] args) {
        Ll1 list = new Ll1();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertLast(80);
        list.insert(3, 2);
        // list.deleteFirst();
        // list.deleteLast();
        list.Delete(2);
        list.display();
    }
    
}
