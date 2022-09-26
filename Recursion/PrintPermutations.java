import java.util.*;

class PrintPermutations {
  static void solve(String str,String ans)
  {
    if(str.length()==0)
    {
      System.out.print(ans+" ");
      return;
    }
    for(int i=0;i<str.length();i++)
    {
      String nu=str.substring(0, i)+str.substring(i+1);
      solve(nu,ans+str.charAt(i));
    }
  }
  public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    String str=inp.next();
    solve(str,"");
  }
}
