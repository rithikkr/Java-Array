import java.util.*;

// Largest number in Array
public class Array04 {
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE; // -infinity
        for(int i = 0; i < number.length; i ++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 3, 5};
        System.out.print("largest value is " + getLargest(number));
    }
}
