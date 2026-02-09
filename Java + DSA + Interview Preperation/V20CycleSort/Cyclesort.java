import java.util.Arrays;

public class Cyclesort {
    public static void main(Implement[] args) {
        int[] arr = {3,5,4,2,1, 8, 7,6};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }

        }
    }
}
