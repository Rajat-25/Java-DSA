import java.util.*;

public class PrintMazePaths {
  static void solve(int sr,int sc,int dr,int dc,String ans)
  {
      if(sr>dr || sc>dc)return;
     if(sr==dr && sc==dc)
     {
      System.out.print(ans+" ");
      return;
     }

     solve(sr, sc+1, dr, dc, ans+"h");
     solve(sr+1, sc, dr, dc, ans+"v");

  }
  public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    int row=inp.nextInt(),col=inp.nextInt();
    solve(1,1,row,col,"");
  }
}
