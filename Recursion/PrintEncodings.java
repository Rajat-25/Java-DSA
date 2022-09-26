import java.util.*;

class PrintEncodings {
  static void solve(String str,String ans)
  {
    if(str.length()==0)
    {
      System.out.println(ans);
      return;
    }
    int num1=str.charAt(0)-'0';
    char x=(char)('a'+num1-1);
    if(num1!=0)solve(str.substring(1),ans+x);
    if(str.length()>1)
    {
        int num2=Integer.parseInt(str.substring(0 ,2));
        char y=(char)('a'+num2-1);
        if(num2>=10 && num2<=26)solve(str.substring(2),ans+y);
    }

  }
  public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    String num=inp.next();
    solve(num,"");
  }
}
