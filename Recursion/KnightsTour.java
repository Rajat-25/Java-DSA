import java.util.*;

public class  KnightsTour{

public static void display(int chess[][])
  {
    int n=chess.length;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)  System.out.print(chess[i][j]+" ");
      System.out.println();
    }
    System.out.println();
  }


  public static void solve(int chess[][],int row,int col,int ms)
  { 
    if(row<0||col<0||row>=chess.length|| col>=chess.length|| chess[row][col]!=0) return;
    
     if(ms==(chess.length*chess.length))
     {
       chess[row][col]=ms;
       display(chess);
       chess[row][col]=0;
       return;
     }
    chess[row][col]=ms;
    solve(chess,row-2,col+1,ms+1);
    solve(chess,row-1,col+2,ms+1);
    solve(chess,row+1,col+2,ms+1);
    solve(chess,row+2,col+1,ms+1);
    solve(chess,row+2,col-1,ms+1);
    solve(chess,row+1,col-2,ms+1);
    solve(chess,row-1,col-2,ms+1);
    solve(chess,row-2,col-1,ms+1);
    chess[row][col]=0;
  }

  public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    int n=inp.nextInt();
    int [][]chess=new int [n][n];
    int row=inp.nextInt(),col=inp.nextInt();
    solve(chess, row, col, 1);
  }
}
