/**
 * Matrices
 */
import java.util.*;
public class Matrices {
    public static boolean search(int matrix[][] ,int key){
        
        for(int i =0; i<matrix.length; i++)
        {
            for(int j = 0 ; j<matrix[0].length; j++){
                if(matrix[i][j]==key)
                {
                     System.out.println("Found at cell :"+j +"," + i );
                      return true; 
                }

               
            }
    }
    return false;
    
}
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n =3, m = 3;
        int key = 100;
        n  = matrix.length ;
        m = matrix[0].length;
        Scanner sc= new Scanner(System.in);
        for(int i = 0; i<n; i++){
            for(int j= 0; j<m ; j++){
                matrix[i][j] = sc.nextInt();

            }
        }
        for(int i = 0 ; i<matrix.length;i++)
        {
            for(int j = 0; j<matrix[0].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        

        search(matrix, key);
    }

    
}