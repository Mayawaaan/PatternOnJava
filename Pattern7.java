public class Pattern7 {
    public Pattern7(int n){
        for (int row = 0; row < 2*n; row++) {
            int c = row > n ?2*n-row :row;
            for (int col = n; col > c; col--) {
                System.out.print(" ");
            }
            for (int col = c; col > 0 ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
