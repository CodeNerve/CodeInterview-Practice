public static boolean oneEditAwayBE(String s1, String s2) {
		
		//Brute force and efficient
		if(Math.abs(s1.length() - s2.length()) != 1 && Math.abs(s1.length() - s2.length()) != 0)
			return false;
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(char c : s1.toCharArray()) {
			if(hm.containsKey(c))
				hm.put(c, hm.get(c)+1);
			else
				hm.put(c, 1);
		}
		
		int count = 0;
		
		for(char c : s2.toCharArray()) {
			if(count > 1) {
				System.out.println("count increased");
				return false;
			}
			
			if(!hm.containsKey(c)) {
				count++;
				hm.put(c, 1);
			}
			
			else
				hm.put(c, hm.get(c)-1);
			
			if(hm.get(c) < 0) {
				System.out.println("negative found");
				return false;
			}
		}
		
		return true;
		
	}
