
import java.util.*;
public class Moremaze {
   public static void main(String[] args) {
       boolean[][] maze = {
           {true, true, true},
           {true,true, true},
           {true, true, true}
       };
       int [][] path=new int[maze.length][maze[0].length];
         allpathprint("", maze, 0, 0, path, 1);
   }
   
        static void allpath(String p  ,boolean[][] maze, int r , int c){
        if(r==maze.length-1 && c==maze[0].length-1){
        
            System.out.println(p);
            
            return;
        }
        if(maze[r][c]==false){
            return;
        }
        //i am considering in my path
        maze[r][c]=false;

        if(r<maze.length-1){
           allpath(p+'D', maze, r+1, c);
        }
        if(c<maze[0].length-1){
           allpath(p+'R', maze, r, c+1);
        }
        
        if(r>0){
           allpath(p+'U', maze, r-1, c);
        }
        if(c>0){
           allpath(p+'L', maze, r, c-1);
        }
        //this is where the function will get over 
        // so also remove the changes made by the function
        maze[r][c]=true;
    
    }  

      static void allpathprint(String p  ,boolean[][] maze, int r , int c, int path[][],int step){
        if(r==maze.length-1 && c==maze[0].length-1){
        
            for(int arr[]:path){
             System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }
        if(maze[r][c]==false){
            return;
        }
        //i am considering in my path
        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1){
           allpathprint(p+'D', maze, r+1, c,path,step+1);
        }
        if(c<maze[0].length-1){
           allpathprint(p+'R', maze, r, c+1,path,step+1     );
        }
        
        if(r>0){
           allpathprint(p+'U', maze, r-1, c,path, step+1);
        }
        if(c>0){
           allpathprint(p+'L', maze, r, c-1,path, step+1);
        }
        //this is where the function will get over 
        // so also remove the changes made by the function
        maze[r][c]=true;
        path[r][c]=0;
    
    } 
}
