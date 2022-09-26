import java.util.*;

class GetMazePaths{

  public static ArrayList<String> mazePaths(int sr,int sc,int dr,int dc)
  {
    if(sr==dr && sc==dc)
    {
      ArrayList<String>temp=new ArrayList<>();
      temp.add("");
      return temp;
    }
    if(sr>dr || sc>dc)
    {
      ArrayList<String>temp=new ArrayList<>();
      return temp;
    }
    ArrayList<String> hPath=mazePaths(sr,sc+1,dr,dc);
    ArrayList<String> vPath=mazePaths(sr+1,sc,dr,dc);
    ArrayList<String>ans=new ArrayList<>();

    for(String val:hPath)ans.add("h"+val);
    for(String val:vPath)ans.add("v"+val);
    return ans;
  }
  public static void main(String[] args) {
   Scanner in=new Scanner(System.in);
   int sr=in.nextInt(), sc=in.nextInt(),dr=in.nextInt(),dc=in.nextInt();
   ArrayList<String> ans=mazePaths(sr,sc,dr,dc);
   System.out.println(ans);
  }
}
