public class Pattern1 
{
    
    public Pattern1(int n) {
        {   
            for (int row = 0; row < n; row++) {
            for (int col = row; col < n; col++) {
                System.out.print("* ");    
            }
            System.out.println();    
        }
    }
    
}
}