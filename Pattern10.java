public class Pattern10 {
    public Pattern10(int n){
        for (int row = 0; row <= 2*n; row++) {
            int c = row > n ? 2*n-row:row;
            for (int col = 0; col < c; col++) {
                System.out.print(" ");
            }
            for (int col = n; col >= c; col--) {
                System.out.print("* ");
            }
            for (int col = c; col >= 0; col--) {
                System.out.print(" ");   
            }
            System.out.println();
        }
    }

}
