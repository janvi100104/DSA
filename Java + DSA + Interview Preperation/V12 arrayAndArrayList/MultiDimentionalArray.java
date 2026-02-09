import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalArray {
    public static void main(Implement[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];

        // int [][] arr ={
        //     {1,2,3},{4,5,6},{7,8,9,2}
        // };
for(int i=0;i<arr.length;i++){
    for (int j = 0; j < arr[i].length; j++) {
        arr[i][j]=sc.nextInt();
    }
}
// for(int i=0;i<arr.length;i++){
//     for (int j = 0; j < arr[i].length; j++) {
//         System.out.println(arr[i][j]);
//     }
// }
for(int[] a : arr){
    System.out.println(Arrays.toString(a));
}
sc.close();
    }
}
