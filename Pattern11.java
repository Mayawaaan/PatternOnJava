public class Pattern11 {
        public Pattern11(int n){
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < row; col++) {
                    System.out.print(" ");
                }
                for (int col = row; col < n; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
        }
}
