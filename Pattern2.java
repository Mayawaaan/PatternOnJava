public class Pattern2 {
    public Pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = row; col <= n; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
        
    }
    
}
