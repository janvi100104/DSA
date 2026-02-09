
// Q1:Insert using recursion
public class prac1 {
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
    //insertion using recursion
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

    //delete dupllicat in sorted ll
    
    public void duplicate(){
        Node node = head;
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail=node;
        tail.next = null;
    }
    //merge two sorted ll
    public static prac1 merge(prac1 first, prac1 second){
        Node f = first.head;
        Node s = second.head;
        prac1 ans = new prac1();
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
    //detect cycle slow and fast pointer approach
    public boolean detectCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    ////length of linked list cycle
     public int detectCycleLength(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                //caluclate length
            Node temp = slow;
                int length=0;
                do{
                    temp = temp.next;
                    length++;
                }
                while(temp!=slow);
                return length;
            }
        }
        return 0;
    }
    //starting node of cycle
    // Approach: move one pointer ahead by cycle length and then move both pointers one step at a time
    public Node startingNodeOfCycle(){
        int cycleLength = detectCycleLength();
        if(cycleLength == 0){
            return null;
        }
        Node pointer1 = head;
        Node pointer2 = head;
        //move pointer2 ahead by cycle length
        for(int i=0;i<cycleLength;i++){
            pointer2 = pointer2.next;
        }
        //move both pointers one step at a time
        while(pointer1 != pointer2){
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return pointer1; //starting node of cycle
    }

    //happy number
      public boolean isHappy(int n) {
         int slow = n;
         int fast = n;
         do{
            slow= squareSum(slow);
            fast = squareSum(squareSum(fast));
         }while(slow != fast);
         if(slow ==1){
            return true;
         }
            return false;
         

    }
    private int squareSum(int n){
        int sum =0;
      while(n>0){
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
      }
        return sum;
    }
    //middle node of ll
     public Node middleNode(Node head) {
        Node slow= head;
        Node fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp= temp.next;
        }
    
    }
    public static void main(String[] args) {
        prac1 list = new prac1();
        list.insertRec(10, 0);
        list.insertRec(20, 1);
        list.insertRec(20, 2);  
        
            // list.duplicate();
        list.display();
      System.out.println(list.detectCycle());

        }
}

