

public class prac {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6
        };
        System.out.println(sorted(arr, 0));
        System.out.println(findIndex(arr, 9, 0));
    }
    static boolean sorted(int[] arr,int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
    static boolean find(int[] arr,int target , int index){
        if(index == arr.length){
            return false;
        }
        return arr[index]==target || find(arr, target, index+1);
    }
    static int findIndex(int[] arr,int target , int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findIndex(arr, target, index+1);
        }
    }
}
