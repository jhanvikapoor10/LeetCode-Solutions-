class Program_1295_LeetCode {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            int n = nums[i];
            int digits = 0;
            while(n>0){
                n = n/10;
                digits++;
            }
            if(digits % 2 == 0){
                count++;
            }
        }
        return count;
    }
}


//LOCAL JAVA PROGRAM FOR THIS 
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        //taking the input
        System.out.print("Enter "+size+" elements: ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        //printing the output
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //the actual code for searching and counting numbers with even digits
        int count = 0;
        for(int i = 0; i<size; i++){
            int num = arr[i];
            int digits = 0;
            while(num>0){
                num = num/10;
                digits++;
*/
