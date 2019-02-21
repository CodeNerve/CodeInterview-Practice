public static boolean isPalindrome(LinkedListInterviewQuestions list) {
		
    // aabaa is not palindrome for this
    // aabbaa is palindrome
    
		int length = length(list);
    
		if(length%2 != 0)
			return false;
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		int start = 1;
		int mid = length/2;
		
		Node temp = list.head;
		
		while(start <= mid) {
			hm.put(temp.data, start);
			start++;
			temp = temp.next;
		}
		
		int flag = start-1;
		
		while(start <= length) {
			int c = temp.data;
			
			if(hm.get(c) != flag)
				return false;
			
			flag--;
			start++;
			temp = temp.next;
		}
		
		return true;
		
	}
