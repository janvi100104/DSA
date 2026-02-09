

public class ques {
    public static void main(String[] args) {
        String result = skipApple("bbaapplecded");
        System.out.println(result);

    }
    static String skip(String p , String up){
        if(up.isEmpty()){
            return p;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            return skip(p, up.substring(1));
        }
        else{
            return skip(p+ch, up.substring(1));
        }
    }

     static String skipApple( String up){
        if(up.isEmpty()){
            return "";
        }
        
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{
            return up.charAt(0) + skipApple( up.substring(1));
        }
    }
}
