class  Problem1672_Richest_Customer_Wealth.java{
    public int maximumWealth(int[][] accounts) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<accounts.length; i++){
            int sum = 0;
            for(int j = 0; j<accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            if(sum>maxSum){
                maxSum = sum;
                //System.out.print(maxSum);
            }
        }
        return maxSum;
    }
}


//LOCAL JAVA PROGRAM FOR THIS QUESTION (WITH SCANNER AND EVERYTHING)
/* 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("rows: ");
        int rows = sc.nextInt();
        System.out.print("columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i = 0; i<rows; i++){
            System.out.print("Enter the elements for the "+(i+1)+"th row: ");
            for(int j = 0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        //System.out.println(arr.length);
        //System.out.println(arr[0].length);
        int maxSum = Integer.MIN_VALUE;
        int frow = -1;
        for(int i = 0; i<rows; i++){
            int sum = 0;
            for(int j = 0; j<cols; j++){
                sum = sum + arr[i][j];
            }
            System.out.print(sum);
            System.out.println();
            if(sum>maxSum){
                maxSum = sum;
                frow = i;
            }
        }
        System.out.println("The max sum is: "+maxSum);
        System.out.println("The row is: "+frow);
        System.out.println();
        
        sc.close();
    }
    }
*/
