import java.util.Arrays;

public class Question {
    public static void main(Implement[] args) {
        int[]  nums ={1,2,4,5,6,7,8};
        // System.out.println(Arrays.toString(nums));
        // change(nums,1 , 2);
        // System.out.println(max(nums));
        reverse(nums);
        System.out.println(Arrays.toString(nums));
    }

   static void reverse(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
        
            change(nums,start,end);
            start++;
            end--;
     }
    }

  static int max(int[] nums) {
      int max =nums[0];
      
      for(int i = 1;i<nums.length;i++){
        if(nums[i]>max){
            max=nums[i];
        }
      }
      return max;
    }
  
 static void change(int[] nums,int index1, int index2) {
        int temp = nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
}
