import java.lang.reflect.Array;
import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
    //   int ans=count(3,3);
    boolean[][] maze ={
        {true,true,true},
        {true,false,true},
        {true,true,true}
        };
        restriction("", maze, 0, 0);
    }
    
    
    
    static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;
    }
    static ArrayList<String> path(String p  , int r , int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            System.out.println(p);
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1){
           list.addAll(path(p+'D', r-1, c));
        }
        if(c>1){
           list.addAll(path(p+'R', r, c-1));
        }
        return list;
    }
        static ArrayList<String> diagonalpath(String p  , int r , int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            System.out.println(p);
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1 && c>1){
           list.addAll(diagonalpath(p+'D', r-1, c-1));
        }
        if(r>1){
           list.addAll(diagonalpath(p+'H', r-1, c));
        }
        if(c>1){
           list.addAll(diagonalpath(p+'V', r, c-1));
        }
        return list;}

        static void restriction(String p  ,boolean[][] maze, int r , int c){
        if(r==maze.length-1 && c==maze[0].length-1){
        
            System.out.println(p);
            
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
           restriction(p+'D', maze, r+1, c);
        }
        if(c<maze[0].length-1){
           restriction(p+'R', maze, r, c+1);
        }
        
    
    } 

     
}
