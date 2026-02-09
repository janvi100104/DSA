import java.util.Arrays;

public class TwoDArray {
   public static void main(Implement[] args) {
    int[][] arr = {
        {1,2,3,4},{5,6},{8,7,6,5,4,3,2}
    } ;
    int target = 7;
    System.out.println(Arrays.toString(search(arr, target)));   
}

    static int[] search(int[][] arr, int target) {
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (arr[i][j] == target){
                    return new int[]{i,j};
                }
                
            }
        }
        return new int[]{-1,-1};
   } 

}
