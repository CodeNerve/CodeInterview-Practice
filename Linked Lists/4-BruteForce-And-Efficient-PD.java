public static void sumLists(LinkedListInterviewQuestions numL1, LinkedListInterviewQuestions numL2) {
		
		Node head1 = numL1.head;
		Node head2 = numL2.head;
		
		LinkedListInterviewQuestions sumList = new LinkedListInterviewQuestions();
		
		Node temp1 = head1;
		int num1 = 0;
		int m = 1;
		
		while(temp1 != null) {
			num1 += m*temp1.data;
			m *= 10;
			temp1 = temp1.next;
		}
		
		m = 1;
		int num2 = 0;
		Node temp2 = head2;
		
		while(temp2 != null) {
			num2 += m*temp2.data;
			m *= 10;
			temp2 = temp2.next;
		}
		
		int sum = num1 + num2;
		int q = sum;
		int rem;
		
		while(q != 0) {
			rem = q%10;
			q = q/10;
			sumList.add(rem);
		}
		
		sumList.print();
		
	}
