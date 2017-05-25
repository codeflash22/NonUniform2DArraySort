
package labtestarray;

//Author --- Faisal
import java.util.Arrays;
import java.util.Scanner;

public class LabTestArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Number of rows you want: ");
        int arr2D[][] = new int[input.nextInt()][];
        
        
        for(int i=0; i<arr2D.length; i++)
        {
            System.out.println("Enter Number of columns you want for row["+i+"]");
            arr2D[i] = new int[input.nextInt()];
        }
        
        
        for(int row=0; row<arr2D.length; row++)
        {
            System.out.println("Enter values for row["+row+"]");
            for(int col=0; col<arr2D[row].length; col++)
            {
                arr2D[row][col]=input.nextInt();
            }
        }
        
        System.out.println();
        System.out.println("Before Sort....");
        for(int row=0; row<arr2D.length; row++)
        {
            for(int col=0; col<arr2D[row].length; col++)
            {
                System.out.printf("%d ",arr2D[row][col]);
            }
            System.out.println();
        }
        
        //Sorted here
        for(int i = 0; i < arr2D.length; i++)
        {
            Arrays.sort(arr2D[i]);
        }
        
        System.out.println("After Sort....");
        for(int row=0; row<arr2D.length; row++)
        {
            for(int col=0; col<arr2D[row].length; col++)
            {
                System.out.printf("%d ",arr2D[row][col]);
            }
            System.out.println();
        }
        
    }
    
}
