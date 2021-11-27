public class Main {

	public static void main(String[] args) {
		MyLInkedlist ll=new MyLInkedlist() ;
			ll.insertAtFirst(10);
	
		
		ll.insertAtLast(30);
		
		ll.insertAtLast(40);
	
		ll.insertAtLast(50);
		
		ll.insertAtLast(60);
		ll.insertAtIndex(20,ll.size);
		System.out.println(ll.size);
		ll.display();
		
	System.out.println(ll.DelAtStart());
	
		ll.display();
		
		
		
		System.out.println(ll.DelAtEnd());
		ll.display();
		
		System.out.println(ll.DeleteAtIdx(2));
		
		ll.display();
		
			
		}

	}


