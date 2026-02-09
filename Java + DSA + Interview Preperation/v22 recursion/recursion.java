

public class recursion {
    public static void main(String[] args) {
    // System.out.println(fibo(6));
    int[] arr={1,2,3,4,5,6};
    System.out.println(binarySearch(arr,6,0,5));  
    }

     

     static int binarySearch(int[] arr, int i, int j, int k) {
         if(j>k){
            return -1;
         }
         int m =j +(k-j)/2;
         if(arr[m]==i){
            return  m;
         }
         if(i<arr[m]){
            return binarySearch(arr,6,j,m-1);
         }
         return binarySearch(arr, 6, m+1,k);
        }



    static int fibo(int n) {
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
