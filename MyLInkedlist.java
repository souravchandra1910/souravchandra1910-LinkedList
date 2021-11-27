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
            head=node;
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
            return ;
        }
        else if(idx==size) {
            insertAtLast(val);
            return ;
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
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    
    public int DelAtStart() {
        if( head ==null) {
            System.out.println("The List is Empty:");
            return -1 ;
        }
        int val=head.data;
        head=head.next;
        if(head==null) {
            tail=null;
        }
        size--;
        return val;
    }
    
    
    public int DelAtEnd() {
        if( head ==null) {
            System.out.println("The List is Empty:");
            return -1 ;
        }
         if(head.next==null) {
            head=tail=null;
        }
        else {
            Node temp=head;
            while(temp.next!=tail) {
                temp=temp.next;
            }
            int val=tail.data;
            tail=temp;
            tail.next=null;
            size--;
            return val;
        }
        return -1;
    }
    public int DeleteAtIdx(int idx) {
        if(head==null){
        System.out.println("List is empty");
        }
     if(idx < 0  ||  idx > size-1) {
         System.out.println("Invalid arguments");
         
     }
     else if(idx==0){
        return DelAtStart();
     }
     else if(idx==size-1){
       return  DelAtEnd();
     }
     else{
         Node temp=head;
         for(int i=0;i<idx-1;i++){
             temp=temp.next;
         }
         int val=temp.next.data;
         temp.next=temp.next.next;
         
         size--;
         
         return val;
     }
     return -1;
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
