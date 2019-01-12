public static boolean allUniqueCharactersB(String s) {
		
		// Brute Force
		char[] arr = s.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++)
				if(arr[i] == arr[j] && i != j)
					return false;
		}
		
		return true;
		
}
