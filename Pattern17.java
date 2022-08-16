public class Pattern17 {
    public Pattern17(int n){
        for (int row = 1; row <= n; row++) {
            int c = row > n ? 2*n-row:row;
            for (int col = 1; col < c; col++) {
                System.out.print(" ");
            }
            for (int col = n; col >= c; col--) {
                if (col>=n||col<row+1) {
                    System.out.print(row+" ");
                } 
                else if (row<=1||row>=n) {
                    System.out.print(row+" ");
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
