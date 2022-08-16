public class Pattern10 {
    public Pattern10(int n){
        for (int row = 0; row < n; row++) {
            for (int col = row+1; col < n; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
   
}
