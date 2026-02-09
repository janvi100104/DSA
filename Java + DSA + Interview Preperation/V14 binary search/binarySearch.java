
public class binarySearch {
    public static void main(Implement[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, };
        System.out.println(BinarySearch(arr, 4));

    }

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid] ) {
                end = mid - 1;
                
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
