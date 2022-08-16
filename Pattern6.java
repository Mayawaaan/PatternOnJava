public class Pattern6 {
    public Pattern6(int n){
        for (int row = 0; row <= n; row++) {
            
            for (int col =row; col < n; col++) {
                System.out.print("  ");
            }
            int c =row>n?2*n-row:row;
            for (int col = 1; col <= c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
