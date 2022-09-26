import java.util.*;

class GetStairPaths{

  public static ArrayList<String> stairPath(int num)
  {
    if(num==0)
    {
      ArrayList<String> temp=new ArrayList<>();
      temp.add("");
      return temp;
    }
    if(num<0)
    {
      ArrayList<String>temp=new ArrayList<>();
      return temp;
    }
    ArrayList<String> path1=stairPath(num-1);
    ArrayList<String> path2=stairPath(num-2);
    ArrayList<String> path3=stairPath(num-3);
    ArrayList<String>ans=new ArrayList<>();
    for(String val:path1)ans.add("1"+val);
    for(String val:path2)ans.add("2"+val);
    for(String val:path3)ans.add("3"+val);
    return ans;


  }
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int num=sc.nextInt();
   ArrayList<String> ans=stairPath(num);
   System.out.println(ans);
  }
}
