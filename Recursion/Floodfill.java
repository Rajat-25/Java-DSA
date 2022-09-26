import java.util.*;

class Floodfill {
  static void solve(int [][]maze,int sr,int sc,int row,int col,String ans)
  {
    if(sr<0 || sc<0 ||sr==row||sc==col||maze[sr][sc]!=0) return;

    if(sr==row-1 && sc==col-1){System.out.println(ans);return;}
    maze[sr][sc]=-1;
    solve(maze,sr-1,sc,row,col,ans+"t");
    solve(maze,sr,sc-1,row,col,ans+"l");
    solve(maze,sr+1,sc,row,col,ans+"d");
    solve(maze,sr,sc+1,row,col,ans+"r");
    maze[sr][sc]=0;
  }
  public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    int row=inp.nextInt(),col=inp.nextInt();
    int [][]maze=new int[row][col];
     for(int i=0;i<row;i++)
     {
      for(int j=0;j<col;j++) maze[i][j]=inp.nextInt();
     }
     solve(maze,0,0,row,col,"");
  }
}
