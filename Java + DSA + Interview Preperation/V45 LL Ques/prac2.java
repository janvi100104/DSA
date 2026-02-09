
public class prac2 {
     class Node{
        int value;
        Node next;

        Node(int value, Node next){
        this.value = value;
        this.next = next;
        }
    }
    Node head = null;
    Node tail = null;
    int size = 0 ;
    public void insertRec(int val , int index ){
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val,int index,Node node){
        if(index == 0){
            Node temp = new Node(val , node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1,node.next);
        return node;
    }
    //sort linked list using merge sort
    public Node mergeSort(Node head){
        public static prac2 merge(prac2 first, prac2 second){
        Node f = first.head;
        Node s = second.head;
        prac2 ans = new prac2();
        while(f != null && s != null){
            if(f.value < s.value){
                ans.insertRec(f.value, ans.size);
                f = f.next;
            }else{
                ans.insertRec(s.value, ans.size);
                s = s.next;
            }
        }
        while(f != null){
            ans.insertRec(f.value, ans.size);
            f = f.next;
        }
        while(s != null){
            ans.insertRec(s.value, ans.size);
            s = s.next;
        }
        return ans;
    }
    public Node middleNode(Node head) {
        Node slow= head;
        Node fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    
    }
    public static void main(String[] args) {
        prac2 list = new prac2();
    }
}
