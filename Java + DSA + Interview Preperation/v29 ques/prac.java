
import java.util.*;
public class prac {
    public static void main(String[] args) {
    //  triangle(4, 0);  
    //  triangle2(1, 0);
    int[] arr ={4,9,2,1};
    // bubble(arr,arr.length-1,0);
    selection(arr, arr.length-1, 0, 0);
    System.out.println(Arrays.toString(arr));
    }
    private static void bubble(int[] arr, int r, int c) {
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp= arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
        bubble(arr, r, c+1);
        }
        else{
            bubble(arr, r-1, 0);
        }
    }

    private static void selection(int[] arr, int r, int c,int max) {
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selection(arr, r, c+1, c);
            }
            else{
                selection(arr, r, c+1, max);
            }}

            else{
                int temp= arr[c];
                arr[c]=arr[max];
                arr[max]=temp;
            }
        
        
    }
    static void triangle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            triangle(r, c+1);
        }
        else{
            System.out.println();
            triangle(r-1, 0);
        }
    }

    static void triangle2(int r,int c){
        if(r==5){
            return;
        }
        if(c<r){
            System.out.print("*");
            triangle2(r, c+1);
        }
        else{
            System.out.println();
            triangle2(r+1, 0);
        }
    }
}
