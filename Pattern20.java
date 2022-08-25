public class Pattern20 {
    public Pattern20(int n){
        for(int row=n;row>1;row--){
            for(int col = row;col>=1;col--){
                System.out.print("* ");
            }
            for (int col = 2*n-row-1; col >= row ; col--) {
                System.out.print("  ");
            }
            for (int col = row; col >0; col--) {
                System.out.print("* ");
            }           
            if(row>2){
                System.out.println();
            }else{
                continue;
            }
        }
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
            }
            for (int col = row ; col <= n-1; col++) {
                System.out.print("    ");
            }
            int c =row>n?2*n-row:row;
            for (int col = 1; col <= c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Pattern20 foo = new Pattern20(5);
        System.out.println(foo);
    }
}
