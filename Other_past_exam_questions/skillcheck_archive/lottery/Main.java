//言語：Java
//問題URL：https://paiza.jp/works/mondai/skillcheck_archive/lottery
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
        int n=sc.nextInt();
        for (int i=0; i<n;i++ )
        {
            String ans;
            int x=sc.nextInt();
            if(x==b)
            ans="first";
            
            else if(Math.abs(x-b)==1)
            ans="adjacent";
            
            else if(x%10000==b%10000)
            ans="second";
            
            else if(x%1000==b%1000)
            ans="third";
            
            else
            ans="blank";
            
            
            System.out.println(ans);
            
        }
        
        
    }
}
//```