public class Pattern18 {
        public Pattern18(int n){
            int c = 1;
            for (int row = 1; row < n; row++) {
                for (int col = 1; col <= row; col++) {
                    System.out.print(c+" ");
                    c++;
                }
                System.out.println();
            }
        }
    }
