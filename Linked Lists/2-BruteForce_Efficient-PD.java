public void kFromLast(int k) {
		Node temp = head;
		int length = 0;
		
		while(temp != null) {
			temp = temp.next;
			length++;
		}
		
		if(length > k) {
			temp = head;
			int count = 0;
			
			while(count != length - k) {
				temp = temp.next;
				count++;
			}
			
			System.out.println(temp.data);
		}
		
		else
			System.out.println("Not possible");
	}
