public class Pattern19 {
        public Pattern19(int n){
            for (int row = 0; row < n-1; row++) {
                for (int col = row+1; col < n; col++) {
                    System.out.print(" ");
                    
                }
                for (int col = 2*row; col >= 0; col--) {
                    if(col==row||col>=2*row){
                        System.out.print("* ");
                    }
                    else{
                       System.out.print("  ");
                    }
                }
                System.out.println();
            }
        
        for (int row = 1; row <= n; row++) {
            int c = row > n ? 2*n-row:row;
            for (int col = 1; col < c; col++) {
                System.out.print(" ");
            }
            for (int col = n; col >= c; col--) {
                if (col>=n||col<row+1) {
                    System.out.print("* ");
                } 
                else if (row>=n) {
                    System.out.print("* ");
                }    
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}