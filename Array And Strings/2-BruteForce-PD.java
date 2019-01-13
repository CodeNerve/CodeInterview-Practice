public static void permutation1(String pre, String s) {
		
		int n = s.length();
		
		if(n == 0)
			str.add(pre);
		
		else {
			
			for(int i=0;i<n;i++)
				permutation1(pre+s.charAt(i), s.substring(0, i) + s.substring(i+1,n));
			
		}
		
	}
	
public static boolean checkPermutationB(String other, String s) {
		
		//Brute Force
		permutation1("",s);
		
		for(int i=0;i<str.size();i++) {
			if(other.equals(str.get(i)))
				return true;
		}
		
		return false;
}
