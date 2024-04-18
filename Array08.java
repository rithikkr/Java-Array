public class Array08 {
    // Print subarrays

    public static void printSubarray(int number[]){
        for(int i = 0; i < number.length; i ++){
            int start = i;
            for(int j = i; j < number.length; j ++){
                int end = j;
                for(int k = start; k <= end; k ++){ //print
                    System.out.print(number[k] + " "); //subarray
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        printSubarray(number);
    }
}
