

public class Quesions {
   public static void main(String[] args) {
    // int n = 76;
    int[] arr = {1,2,3,4,5,5,4,2,1};
    System.out.println(occursOne(arr));
    // System.out.println(isodd(n));
   }

    static int occursOne(int[] arr) {
        int unique=0;
    for(int i =0;i<arr.length-1;i++){
        unique = arr[i]^arr[i+1];
    }
    return unique;
}

   static boolean isodd(int n) {
    return (n & 1) == 1;
   } 
}
