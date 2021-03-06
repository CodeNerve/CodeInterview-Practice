public static boolean checkPermutationE(String other, String s) {
	// This method checks for all possible permutations (not only same length) efficiently
	// The Brute Force method for this question just checks same length permutations
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(char c : s.toCharArray()) {
			if(hm.containsKey(c))
				hm.put(c, hm.get(c)+1);
			
			else
				hm.put(c, 1);
		}
		
		for(char c : other.toCharArray()) {
			if(!hm.containsKey(c) || hm.get(c) < 0)
				return false;
			
			else
				hm.put(c, hm.get(c)-1);
		}
		
		return true;
		
}
