public class MyLInkedlist {

    private Node head;
    private Node tail;
    public int size;
      
   public MyLInkedlist(){
        this.size=0;
    }
   
    public void insertAtFirst(int val) {
        Node node =new Node(val);
        if(head==null) {
            head=tail=node;
        }
        else {
            node.next=head;
        }
        size++;
    }
    
    public void insertAtIndex(int val,int idx) {
        if( idx < 0  || idx > size) {
            System.out.println("Invalid");
            return;
        }
        if(idx==0) {
            insertAtFirst(val);
        }
        else if(idx==size+1) {
            insertAtLast(val);
        }
        else {
            Node node =new Node(val);
            Node temp=head;
            for(int i=0;i<idx-1;i++) {
               temp=temp.next; 
            }
            Node nex=temp.next;
            temp.next=node;
            node.next=nex;
            size++;
        } 
    }
    
    public void display() {
        if(head==null) {
            System.out.println("List is empty");
        }
        Node temp=head;
        while(temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    
    
    public void insertAtLast(int val) {
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    
    public class Node{
        private int data;
        private Node next;
        
        public Node(int data) {
            this.data=data;
        }
        public Node(int data,Node next) {
            this.data=data;
            this.next=next;
        }
        
        
    }
    
        
        
        

}
