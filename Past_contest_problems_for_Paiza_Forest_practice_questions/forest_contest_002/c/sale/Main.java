//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_002/forest_contest_002__c_sale
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean BuyPants=false;
        int sum=0;
        for (int i=0;i<n ;i++ )
        {
            
            
            var s=sc.next();
            var p=sc.nextInt();
            sum+=p;
            
            if(s.equals("pants"))
            BuyPants=true;
            
        }
        
        if(BuyPants&&sum>=2000)
        sum-=500;
        
        System.out.println(sum);
        
        
    }
}
//```