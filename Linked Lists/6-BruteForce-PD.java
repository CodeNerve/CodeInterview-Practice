public static boolean isIntersectionB(LinkedListInterviewQuestions list1, LinkedListInterviewQuestions list2) {
		
		Node temp1 = list1.head;
		Node temp2 = list2.head;
		
		while(temp1 != null) {
			while(temp2 != null) {
				if(temp1.equals(temp2))
					return true;
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}
		
		return false;
		
}
