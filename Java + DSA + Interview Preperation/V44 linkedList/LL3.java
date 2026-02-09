public class LL3 {
        Node head ;
        Node tail ;
        int size =0;
        public LL3(){
            head = null;
            tail = null;
        }
        public void insert(int value){
            Node node = new Node(value);
                if(head == null){
                    head = node;
                    tail= node;
                    return;
                }
            tail.next=node;
            node.next=head;
            tail=node;
        }

        public void delete (int val){
            Node node = head;
            if(node == null){
                return;
            }
            if(node.value==val){
                head=head.next;
                tail.next=head;
                return;
            }
            do{
                Node n = node.next;
                if(n.value == val){
                    node.next = n.next;
                    break;
                }
                node=node.next;
            }while(node!=head);


        }

        public void display(){
            Node  node = head;
            if(head !=null){
                do{
                    System.out.print(node.value + "->");
                    node = node.next;

                }while(node != head);
            }
        }

    class Node {
        int value ;
        Node next; 
        Node(int value){
            this.value = value;
        }
    }
    public static void main(String[] args) {
        LL3 list = new LL3();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.delete(20);
        list.display();
    }
}
