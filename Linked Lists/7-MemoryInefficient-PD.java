public static Node isLoopMI(LinkedListInterviewQuestions list) {
		
		Set<Node> set = new HashSet<Node>();
		Node temp = list.head;
		
		while(temp.next.data != list.head.data) {
			if(set.contains(temp))
				return temp;
			
			else {
				set.add(temp);
				temp = temp.next;
			}
		}
		
		return null;
	}
