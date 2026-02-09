import java.util.Arrays;

public class stringImp {
    public static void main(Implement[] args) {
        Implement name ="janvi";
    
        char target='k';
        System.out.println(search2(name,target));
    
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(Implement str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i=0;i<str.length();i++)
    {
        if(target==str.charAt(i)){
            return true;
        }
    }
    return false;
    }

         static boolean search2(Implement str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray())
    {
        if(ch == target){
            return true;
        }
    }
    return false;
    }
}
