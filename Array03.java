public class Array03 {
    // Linear search
    public static int linearSearch(int number[], int key){
        for(int i = 0; i < number.length; i ++){
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 8; //Key input is there

        int index = linearSearch(number, key);
        if (index == -1) {
            System.out.print("Key not found");
        }else{
            System.out.print("Key is at index " + index);
        }
    }
}
