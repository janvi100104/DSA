
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
      public void alphabetPyramid(int n){
        
          for(int i=0;i<n;i++){
              for(int j=0;j<n-i;j++){
                System.out.print(" ");
                
            }
            char ch = 'A';
            int breakPoint = (2*i+1)/2;
              
              for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);

                // Increment or decrement character
                if (j <= breakPoint) ch++;
                else ch--;
            }
           
            System.out.println("");

            
        }
     }
    
     public void VoidPattern(int n) {

    int inis = 0;

    
    for (int i = 0; i < n; i++) {

        // Left stars
        for (int j = 0; j < n - i; j++) {
            System.out.print("* ");
        }

        // Middle spaces
        for (int j = 0; j < inis; j++) {
            System.out.print("  ");
        }

        // Right stars
        for (int j = 0; j < n - i; j++) {
            System.out.print("* ");
        }

        inis += 2;
        System.out.println();
    }

    inis = 2 * n - 2;


    for (int i = 1; i <= n; i++) {

        // Left stars
        for (int j = 0; j < i; j++) {
            System.out.print("* ");
        }

        // Middle spaces
        for (int j = 0; j < inis; j++) {
            System.out.print("  ");
        }

        // Right stars
        for (int j = 0; j < i; j++) {
            System.out.print("* ");
        }

        inis -= 2;
        System.out.println();
    }
}
 public void VoidPattern2(int n) {

    int inis = 2 * n - 2;

    // Lower half
    for (int i = 1; i < n; i++) {

        // Left stars
        for (int j = 0; j < i; j++) {
            System.out.print("* ");
        }

        // Middle spaces
        for (int j = 0; j < inis; j++) {
            System.out.print("  ");
        }

        // Right stars
        for (int j = 0; j < i; j++) {
            System.out.print("* ");
        }

        inis -= 2;
        System.out.println();

    }
     inis = 0;

    // Upper half
    for (int i = 0; i < n; i++) {

        // Left stars
        for (int j = 0; j < n - i; j++) {
            System.out.print("* ");
        }

        // Middle spaces
        for (int j = 0; j < inis; j++) {
            System.out.print("  ");
        }

        // Right stars
        for (int j = 0; j < n - i; j++) {
            System.out.print("* ");
        }

        inis += 2;
        System.out.println();
    }


}
public void voidSquare(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==0 || i==n-1 || j==0 || j==n-1){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }

        }
        System.out.println();
    }
}
public void numberMaze(int n){
    for(int i=0;i<2*n-1;i++){
        for(int j=0;j<2*n-1;j++){
           int top =i;
           int bottom = 2*n-2 - i;
              int left = j;
                int right = 2*n-2 - j;
                int min = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print((n - min) + " ");  
    }
        System.out.println();
}
}

    public static void main(String[] args) {
        Pattern p = new Pattern();
        
    
        p.voidSquare(5);
        p.numberMaze(4);
    }
}
