public class OrderAgnosticBinarySearch {
    public static void main(Implement[] args) {
        int[] arr = { 9,8,7,6,5,4,3,2,1};
        System.out.println(orderAgnosticBS(arr, 7));
    }

  static int orderAgnosticBS(int[] arr,int target){
     int start = 0;
        int end = arr.length - 1;
        //find whether the array is sorted ascending or descending
        boolean isAsc =arr[start] < arr[end];
       
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]  == target){
                return mid;
            }
            if(isAsc)
            {

                if (target < arr[mid] ) {
                    end = mid - 1;
                    
                } else {
                    start = mid + 1;
                } 
            }
            else{
              if (target < arr[mid] ) {
                  start = mid + 1;
                  
                } else  {
                    end = mid - 1;
                } 
            }  
            }
        return-1;
  

}}
