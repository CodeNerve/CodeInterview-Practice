public static void rotateMatrixInPlace(int mat[][]) { 
		int N = mat.length;
       
        for(int i=0;i<N/2;i++) {
        	for(int j=0;j<N-i-1;j++) {
        		int temp = mat[i][j];
        		
        		mat[i][j] = mat[j][N-1-i];
        		mat[j][N-1-i] = mat[j][N-1-i];
        		mat[j][N-1-i] = mat[N-1-i][N-1-j];
        		mat[N-1-i][N-1-j] = mat[N-1-j][i];
        		
        		mat[N-1-j][i] = temp;
        	}
        }
        
        for (int i=0;i<N;i++) { 
            for (int j=0;j<N;j++) 
                System.out.print(" " + mat[i][j]); 
       
            System.out.println(); 
        } 
        System.out.println();
  }
  
  // The whole algorithm is based on logic
