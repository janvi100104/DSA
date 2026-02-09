

public class Maths {
    public static void main(String[] args) {
        int n =8;
        prime(n);
    }

     static void prime(int n) {
        if(n<=1){
            System.out.println("not prime");
        }
        for(int i =2; i*i<n/2;i++){
            if(n%i==0){
                System.out.println("Not Prime");
            }
            System.out.println("prime");
        }
    }
}


