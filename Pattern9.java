public class Pattern9 {
    public Pattern9(int n){
        for (int row = 0; row < 2*n; row++) {
            int c = row > n ? 2*n-row:row;
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
