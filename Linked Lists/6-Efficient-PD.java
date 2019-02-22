public static boolean isIntersectionE(LinkedListInterviewQuestions list1, LinkedListInterviewQuestions list2) {
		
		Node temp1 = list1.head;
		Node temp2 = list2.head;
		
		HashMap<Node,Boolean> hm = new HashMap<Node,Boolean>();
		
		while(temp1 != null) {
			hm.put(temp1, true);
			temp1 = temp1.next;
		}
		
		while(temp2 != null) {
			if(hm.containsKey(temp2))
				return true;
			
			temp2 = temp2.next;
		}
		
		return false;
}
