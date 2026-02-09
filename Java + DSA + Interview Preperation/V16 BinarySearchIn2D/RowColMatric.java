import java.util.Arrays;

public class RowColMatric {
    public static void main(Implement[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(search(matrix,6)));
    }
    static int[] search(int[][] matrix,int target){
        int r = 0;
        int c= matrix.length-1;
        while(r<matrix.length && c>=0)
        {
            if(target < matrix[r][c]){
                c--;
            }
            else if(target> matrix[r][c]){
                r++;
            }
            else{
                return new int[]{r,c};
            }
        }
        return new int[]{-1,-1};
    }
}
