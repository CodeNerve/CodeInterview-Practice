public static void zeroMatrix(int[][] a) {
		
		// only for one zero efficient O(n^2)
		// for more than one zero in a matrix O(n^3)
		
		int x = -1, y = -1;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				
				if(a[i][j] == 0) {
					x = i;
					y = j;
					break;
				}
				
			}
		}
		
		if(x == -1 || y == -1)
			return;
		
		for(int j=0;j<a[0].length;j++)
			a[x][j] = 0;
		
		for(int i=0;i<a.length;i++)
			a[i][y] = 0;
		
		for (int i=0;i<a.length;i++) { 
            for (int j=0;j<a[0].length;j++) 
                System.out.print(" " + a[i][j]); 
       
            System.out.println(); 
        } 
        System.out.println();
		
	}
