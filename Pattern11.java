public class Pattern11 {
        public Pattern11(int n){
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    if (row<1||row>=n-1) {
                        System.out.print("* ");
                    }
                    else if(col<1||col>=n-1)  {
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