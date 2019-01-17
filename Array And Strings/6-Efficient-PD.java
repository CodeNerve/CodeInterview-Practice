public static String compressStringE(String s) {
		
		 if (s.length() < 3) 
			 return s;
		
		 char[] string = s.toCharArray();

	   int n = string.length;
	   int i = 0;
	   int k = 0;
	    
	   char[] out = new char[n + 1];
	   out[k++] = string[0];
     out[k++] = '1';
     
     for (i=1;i<n && k<n;i++) {
	    	
	       if (string[i] == string[i-1] && out[k - 1] != '9') 
	           out[k - 1]++;
	       else {
            out[k++] = string[i];
            out[k++] = '1';
	       }
	   }
	    
	   if(i == n && k < n)
	   	return new String(out, 0, k);
	    
	   else
	   	return s;
		
	}
