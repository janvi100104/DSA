
public class Pattern {
    public void square(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void rightTriangle(int n){
       for(int i = 1 ; i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println("");
       } 
    }
     public void numberTriangle(int n){
       for(int i = 1 ; i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j + " ");
        }
        System.out.println("");
       } 
    }
    public void Triangle(int n){
       for(int i = 1 ; i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i + " ");
        }
        System.out.println("");
       } 
    }
      public void reverseTriangle(int n){
       for(int i = n ; i>0;i--){
        for(int j=1;j<=i;j++){
            System.out.print( "* ");
        }
        System.out.println("");
       } 
    }
     public void reverseNumberTriangle(int n){
       for(int i = n ; i>0;i--){
        for(int j=1;j<=i;j++){
            System.out.print( j + " ");
        }
        System.out.println("");
       } 
    }
     public void pyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
     }
      public void reversePyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*(n-i)-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
     }
      public void Diamond(int n){
        for(int i=0;i<2*n;i++){
            for(int j=0;j<n-Math.abs(n-i);j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
     }
      public void BinaryNumberTriangle(int n){
        int start;
        for(int i=0;i<n;i++){
            if(i%2==0){
                start=1;
            }else{
                start=0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println(" ");
        }
     }
      public void NumberCrown(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i-j+1);
            }
            System.out.println("");

            System.out.println("");
        }
     }
      public void Counting(int n){
        int count =1;
        for(int i=0;i<n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(count++ + " ");
            }
           
            System.out.println("");

            
        }
     }
      public void LetterTriangle(int n){
          for(int i=0;i<n;i++){
              
              for(int j=0;j<i;j++){
                int letter=(char)65;
                System.out.print((char)(letter+j) + " ");
                letter++;
            }
           
            System.out.println("");

            
        }
     }
      public void LetterTriangle2(int n){
          for(int i=n;i>=0;i--){
              
              for(int j=0;j<i;j++){
                int letter=(char)65;
                System.out.print((char)(letter+j) + " ");
                letter++;
            }
           
            System.out.println("");

            
        }
     }
       public void LetterTriangle3(int n){
        int letter = (char)65;
          for(int i=0;i<n;i++){
              
              for(int j=0;j<=i;j++){
                System.out.print((char)(letter+i) + " ");
                
            }
           
            System.out.println("");

            
        }
     }
    public static void main(String[] args) {
        Pattern p = new Pattern();
        
        p.reverseNumberTriangle(5);
    }
}
