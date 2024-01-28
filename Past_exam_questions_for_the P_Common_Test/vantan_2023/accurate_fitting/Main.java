//言語：Java
//問題URL：https://paiza.jp/works/mondai/vantan_2023/vantan_2023__accurate_fitting
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble()*10000;
        int n=sc.nextInt();
        long bunsi=0,bunbo=0;
        for (int i=0;i<n ;i++ )
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            bunsi+=x*y;
            bunbo+=x*x;
            
        }
     //   System.out.println(bunsi);
    //    System.out.println(bunbo);
        
         double aDash=((double)bunsi/(double)bunbo)*10000;
         System.out.println(Math.round(aDash)==Math.round(a)?"Yes":"No");
        
    }
}




//```