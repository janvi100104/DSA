import java.util.Arrays;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
        // enhanced for loop
        for (int i : arr) {

            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
        str[1] = "aila";
        System.out.println(Arrays.toString(str));

        sc.close();
    }
}
