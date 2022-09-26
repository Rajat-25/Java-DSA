import java.util.*;

public class NQueens {
  public static boolean isSafe(int arr[][],int row,int col)
  {
    for(int i=row-1,j=col;i>=0;i--) if(arr[i][j]!=0) return false;
    for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) if(arr[i][j]!=0) return false;
    for(int i=row-1,j=col+1;i>=0 && j<arr.length;i--,j++) if(arr[i][j]!=0) return false;    
    return true;
  }

  public static void solve(int arr[][],int n,int row,String ans)
  {
    if(row==n)
    {
      System.out.println(ans);
      return;
    }
    for(int col=0;col<n;col++){
     if(isSafe(arr,row,col))
     {
      arr[row][col]=1;
      solve(arr, n, row+1, ans+row+"-"+col+",");
      arr[row][col]=0;
     }
    }
  }
  public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    int n=inp.nextInt();
    int [][]arr=new int[n][n];
    solve(arr,n,0,"");

        
  }
}
