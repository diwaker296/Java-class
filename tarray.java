import java.util.*;
public class tarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the rows ");
        int rows = sc.nextInt();
        System.out.println("enter the cols");
        int cols =sc.nextInt(); 
        int[][] number =new int[rows][cols];
        
        // input rows
        for(int i=0;i<rows;i++){
            // input cols
            for(int j=0;j<cols;j++){
                number[i][j]=sc.nextInt();
            }
        }
        // output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
    
}
