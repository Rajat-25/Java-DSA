import java.util.*;
class PrintSubsequence
{ 
   static void solve(String str,String ans)
  {
    if(str.length()==0)
    {
        System.out.println(ans);
        return;
    }
    char ch=str.charAt(0);
    solve(str.substring(1),ans+"");
    solve(str.substring(1),ans+ch);
  }
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        String str=inp.next();
        solve(str,"");
    }
}