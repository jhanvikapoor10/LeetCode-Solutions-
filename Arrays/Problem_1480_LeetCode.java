class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}

//LOCAL JAVA PROGRAM
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        //input
        System.out.print("Enter "+size+" elements: ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        //printing the array
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int sum = 0;
        for(int i = 0; i<size; i++){
            sum = sum + arr[i];
            System.out.print(sum+" ");
        }
    }
}
*/
