import java.util.Scanner;

import java.util.*;

class GetMazePathsWithJump{

  static ArrayList<String> getMazePathWithJump(int sr,int sc,int dr,int dc )
  {
      if(sr==dr && sc==dc)
      {
        ArrayList<String>temp=new ArrayList<>();
        temp.add("");
        return temp;
      }
      ArrayList<String> ans=new ArrayList<>();
      for(int i=1;i<=dc-sc;i++)
      {
        ArrayList<String>hPath=getMazePathWithJump(sr, sc+1, dr, dc);
        for(String val:hPath) ans.add("h"+i+val);
      }
      for(int i=1;i<=dr-sr;i++)
      {
        ArrayList<String>vPath=getMazePathWithJump(sr+1, sc, dr, dc);
        for(String val:vPath) ans.add("v"+i+val);
      }
      for(int i=1;i<=dc-sc && i<=dr-sr;i++)
      {
        ArrayList<String>dPath=getMazePathWithJump(sr+1, sc+1, dr, dc);
        for(String val:dPath) ans.add("d"+i+val);
      }
      return ans;
  }
  public static void main(String []args)
  {
    Scanner inp =new Scanner(System.in);
    int sr=inp.nextInt(),sc=inp.nextInt(),dr=inp.nextInt(),dc=inp.nextInt();
    ArrayList<String>ans =getMazePathWithJump(sr,sc,dr,dc);
    System.out.println(ans);

    
  }
}