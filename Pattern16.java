public class Pattern16 {
    public Pattern16(int n){
        for (int row = 0; row <= n; row++) {
            int c = row > n ? 2*n-row:row;
            for (int col = 0; col < c; col++) {
                System.out.print(" ");
            }
            for (int col = n; col > c; col--) {
                if (col>=n||col==row+1) {
                    System.out.print("* ");
                } 
                else if (row<=0||row>=n) {
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
