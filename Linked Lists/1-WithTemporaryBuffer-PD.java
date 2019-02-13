public void removeDuplicates1() {
		
		// With temporary buffer, assuming unique integers in the linked list
		
		HashMap<Integer,Boolean> table = new HashMap<Integer,Boolean>();
		
		Node previous = null;
		Node n = head;
		
		  while(n != null){
			  
		      if(table.containsKey(n.data))
		          previous.next = n.next;
		      
		      else {
		          table.put(n.data, true);
		          previous = n;
		      }
		      
		      n = n.next;
		  }
	}
