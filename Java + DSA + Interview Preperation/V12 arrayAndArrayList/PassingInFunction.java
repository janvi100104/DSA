import java.util.Arrays;

public class PassingInFunction {
         public static void main(Implement[] args) {
            int[] nums={3,4,6,8} ;
      
         System.out.println(Arrays.toString(nums));   
         change(nums);
                  System.out.println(Arrays.toString(nums));    
 
        }

        static  void change(int[] nums) {
            nums[0]=90;
          }

}
