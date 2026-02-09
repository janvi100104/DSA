import java.util.*;
public class Prac2 {
static int TwoStacks(int x, int[] a , int[] b){
    return twoStacks(x,a,b,0,0) - 1;
}
    private static int twoStacks(int x , int[] a, int[] b , int sum , int count) {
        if(sum > x ){
            return count;
        }
        if(a.length == 0 && b.length == 0){
            return count;
        }
        int ans1 = twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
         int ans2 = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);
        return Math.max(ans1, ans2);
}
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();    
       for(int i = 0 ; i < n ; i++){
        int x = sc.nextInt();
        int na = sc.nextInt();
        int nb = sc.nextInt();
        int[] a = new int[na];
        int[] b = new int[nb];
        for(int j = 0 ; j < na ; j++){
            a[j] = sc.nextInt();
        }
        for(int j = 0 ; j < nb ; j++){
            b[j] = sc.nextInt();
        }
        System.out.println(TwoStacks(x,a,b));
        }
        sc.close();
    }
}