//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_006/forest_contest_006__d_maxinning
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        int k=sc.nextInt();
       // int n=sc.nextInt();
        int sum=0;
        
        for (int i=0;i<9 ;i++ ) 
         {
             sum+=sc.nextInt();
             if(sum>=k)
             {
                 int ans=i+1;
                 if(sum==k)
                 ++ans;
                 
             System.out.println(ans);
             return ;
             }
         
             
         }
         
         
         System.out.println("Yes");
    }
}
//```