public static boolean allUniqueCharactersE(String s) {
		
		// Efficient
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(char c : s.toCharArray()) {
			
			if(hm.containsKey(c))
				return false;
			
			else
				hm.put(c, 1);
			
		}
		return true;
}
