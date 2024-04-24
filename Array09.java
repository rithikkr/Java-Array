import java.util.*;
public class Array09 {

    public static void maxSubarraySum(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < number.length; i ++){
            int start = i;    
            for(int j = i; j < number.length; j ++){
                int end = j;
                currSum = 0;

                for(int k = start; k <= end; k ++){ //print
                    // subarray sum
                    currSum += number[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum is = " + maxSum);
    }

    public static void main(String[] args) {
        int number[] = {1, -2, 6, -1, 3};
        maxSubarraySum(number);
    }
}
