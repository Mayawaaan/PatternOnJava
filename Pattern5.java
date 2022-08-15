public class Pattern5 {
    public Pattern5(int n){
        for (int row = n; row > 0; row--) {
            int c = 2*n-row;
            for (int col = row-1; col < c; col++) {
                System.out.print(" ");
            }
            for (int col = row; col >0; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
   
}
