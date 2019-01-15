public static boolean probablePalindromeE(String s) {
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(char c : s.toCharArray()) {
			if(hm.containsKey(c))
				hm.put(c, hm.get(c) + 1);
			
			else
				hm.put(c, 1);
		}
		
		for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if(entry.getValue()%2 != 0)
				return false;
		}
		
		return true;
	}
