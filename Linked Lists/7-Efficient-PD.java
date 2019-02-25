public static Node isLoopE(LinkedListInterviewQuestions list) {
		
		Node slow = list.head;
		Node fast = list.head;
		int count = 0;
		int len = length(list);
		Node common = null;
		
		while(count < 2*len) {
			if(slow.data == fast.data)
				common = slow;
			
			else {
				fast = fast.next.next;
				slow = slow.next;
				count++;
			}
		}
		
		if(common == null)
			return common;
		
		Node temp = list.head;
		
		while(true) {
			if(temp.data == common.data)
				return temp;
			else {
				temp = temp.next;
				common = common.next;
			}
		}
		
	}
