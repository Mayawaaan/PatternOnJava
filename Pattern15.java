public class Pattern15 {
    public Pattern15(int n){
        for (int row = 1; row <= n; row++) {
            for(int col = row; col < n; col++) {
                System.out.print(" ");
                
            }
            int c = 2*row-1;
            for (int col = c; col >= 1; col--) {
                if(col==row||col>=c){
                    System.out.print(row+" " );
                }
                else if (row>=n&&row<col) {
                    System.out.print(row+" " );
                    
                }
                else{
                   System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
