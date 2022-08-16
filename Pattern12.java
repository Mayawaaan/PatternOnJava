public class Pattern12 {
    public Pattern12(int n){
        for (int row = 0; row < n; row++) {
            for (int col = row; col < n; col++) {
                System.out.print(" ");
                
            }
            for (int col = 2*row; col >= 0; col--) {
                if(col==row||col>=2*row){
                    System.out.print("* ");
                }
                else if (row>=n-1&&row<col) {
                    System.out.print("* ");
                    
                }
                else{
                   System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
}
