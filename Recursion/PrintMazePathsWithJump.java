import java.util.*;
public class PrintMazePathsWithJump {
  static void solve(int sr,int sc,int dr,int dc,String ans)
  { 
    if(sr==dr && sc==dc)
    {
      System.out.print(ans+" ");
      return;
    }

   for(int i=1;i<=dc-sc;i++) solve(sr,sc+i,dr,dc,ans+"h"+i);
   for(int i=1;i<=dr-sr;i++) solve(sr+i,sc,dr,dc,ans+"v"+i);
   for(int i=1;i<=dr-sr && i<=dc-sc;i++) solve(sr+i,sc+i,dr,dc,ans+"d"+i);
   
  }
  public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    int row=inp.nextInt(),col=inp.nextInt();
    solve(1,1,row,col,"");
  }
}
