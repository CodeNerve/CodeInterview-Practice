public void removeMiddleNode() {
		Node temp = head;
		int length = 0;
		
		while(temp != null) {
			temp = temp.next;
			length++;
		}
		
		int mid = length/2;
		temp = head;
		
		while(mid != 1) {
			temp = temp.next;
			mid--;
		}
		
		System.out.println("Node to be deleted "+temp.next.data);
		
		deleteAfter(temp);
		
		print();
}

public void deleteAfter(Node del){
        if(del.next == head){
            head = del;
        }
        if(del.next == null){
           //do nothing because there is nothing to delete
        }
        else {
        	del.next = del.next.next; 
        }
}
