
public class Implement {
    public static boolean main(Implement[] args){
        String name ="abcdcba";
        name = name.toLowerCase();
        for(int i=0;i<=name.length()/2;i++){
            char start =name.charAt(i);
            char last = name.charAt(name.length()-1-i);
            if(start != last){
                return false;
        }
        
    }
    return true;
}
}
