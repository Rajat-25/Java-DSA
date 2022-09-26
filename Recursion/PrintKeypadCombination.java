import java.util.*;

public class PrintKeypadCombination {
  static void solve(String codes[],String str,String ans)
  {
    if(str.length()==0)
    {
      System.out.print(ans+" ");
      return;
    }
    String curr=codes[str.charAt(0)-'0'];
    for(int i=0;i<curr.length();i++)
    {
      solve(codes,str.substring(1),ans+curr.charAt(i));
    }
  }
  public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    String codes[]={"abc","def","ghi","jkl","mnop","qrst","uv","wxyz", ",;" ,"?!"};
    String str=inp.next();
    solve(codes,str,"");
  }
}
