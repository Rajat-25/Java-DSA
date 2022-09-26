import java.util.*;

class Keypadcombination {
  public static ArrayList<String> displayCombination(String []sarr,String str)
  {
    if(str.length()==0)
    {
      ArrayList<String> li=new ArrayList<>();
      li.add("");
      return li;
    }
    char ch=str.charAt(0);
    String rem= str.substring(1);
    ArrayList<String>temp=displayCombination(sarr,rem);
    ArrayList<String>ans=new ArrayList<>();
    String curr=sarr[ch-'0'];
     for(int m=0;m<curr.length();m++)
     {
      for(int n=0;n<temp.size();n++) ans.add(curr.charAt(m)+temp.get(n));
     }
     return ans;
  }
   public static void main(String[] args) throws java.lang.Exception {
     Scanner sc=new Scanner(System.in);
     String str=sc.next();
     String sarr[]={"abc","def","ghi","jkl","mnop","qrst","uv","wxy", "z,;" ,"?!"};
     ArrayList<String> ans=displayCombination(sarr, str);
     System.out.println(ans);
  }
}
