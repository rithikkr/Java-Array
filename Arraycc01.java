import java.util.*;

public class Arraycc01 {
    // Get smallest
    public static int getSmallest(int number[]){
        int smallest = Integer.MAX_VALUE; //+infinity
        for(int i = 0; i < number.length; i ++){
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int number[] = {1, 2, 3, 0, 5};
        System.out.print("Smallest number is " + getSmallest(number));
    }
}
