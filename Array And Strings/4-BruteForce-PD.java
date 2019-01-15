public static void permutation2(String s, String pre) {
		
		if(s.length() == 0)
			a.add(pre);
		
		else {
			
			for(int i=0;i<s.length();i++) {
				String rem = s.substring(0,i) + s.substring(i+1);
				permutation2(rem, pre + s.charAt(i));
			}
			
		}
		
	}
	
	public static boolean checkPalindrome(String s) {
		
		int start = 0;
		int end = s.length() - 1;
		
		if(s.length()%2 != 0)
			return false;
		
		while(start <= end) {
			
			char c1 = s.charAt(start);
			char c2 = s.charAt(end);
			
			if(c1 != c2)
				return false;
			
			start++;
			end--;

		}
		
		return true;
	}
	
	public static boolean probablePalindromeB(String s) {
		
		permutation2(s, "");
		
		for(int i=0;i<a.size();i++) {
			if(checkPalindrome(a.get(i))) {
				System.out.println("palindrome is "+a.get(i));
				return true;
			}
		}
		
		return false;
	}
