import java.util.*;
class PrintStairPath
{
    static void solve(int num,int ct,String ans)
    {
        if(ct==num)
        {
            System.out.println(ans);
            return;
        }
        for(int i=1;i<=num-ct;i++) solve(num,ct+i,ans+i);
    }
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        solve(num,0,"");
    }
}