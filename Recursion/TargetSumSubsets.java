import java.util.*;

class TargetSumSubsets {
  static void solve(int data[],int target,int sum,int idx,String ans)
  {
    if(idx==data.length)
    {
      if(sum==target)System.out.println(ans);
      return;
    }
    solve(data,target,sum+data[idx],idx+1,ans+data[idx]+" ");
    solve(data,target,sum,idx+1,ans+"");
  }
  public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    int data[]={10,20,30,40,50};
    int target=inp.nextInt();
    solve(data,target,0,0,"");
  }
}
