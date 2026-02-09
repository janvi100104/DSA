

public class implement {
    public static void main(Implement[] args) {
        int[] nums = {1,3,6,4,3};
        System.out.println(linearSearch(nums,6));
    }

     static int linearSearch(int[] nums,int target) {
        if(nums.length==0){
            return -1;
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
