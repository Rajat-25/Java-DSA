import java.util.*;

public class GetSubsequence {
 static ArrayList<String> solve(String str){
  if(str.length()==0)
  {
    ArrayList<String>temp=new ArrayList<>();
    temp.add("");
    return temp;
  }
    char ch=str.charAt(0);
    ArrayList<String>ans=new ArrayList<>();
    ArrayList<String>temp=solve(str.substring(1));
    for(String val:temp)ans.add(""+val);
    for(String val:temp)ans.add(ch+val);
    return ans;
  }
  public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    String str=inp.next();
    ArrayList<String> ans=solve(str);
    System.out.println(ans);

  }
}
