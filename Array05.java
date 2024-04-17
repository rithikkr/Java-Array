public class Array05 {
    // Binary search
    public static int binarySearch(int number[], int key){
        int start = 0;
        int end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // Comparision
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) { // right
                start = mid + 1;
            }else{ // left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {1, 2, 4, 8, 10, 12};
        int key = 10;
        System.out.println("index for key is " + binarySearch(number, key));
    }
}
