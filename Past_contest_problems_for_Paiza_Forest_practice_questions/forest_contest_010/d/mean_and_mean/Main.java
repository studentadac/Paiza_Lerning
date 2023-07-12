//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_010/forest_contest_010__d_mean_and_mean
//コメント:
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        var souka=(a+b)/2;
        souka*=souka;
        
        var soujou =a*b;
        String ans;
        if(souka>soujou)
        ans="arithmetic";
        else if(soujou>souka)
        ans="geometric";
        else
        ans="equal";
        
        System.out.println(ans);
        
        
    }
}
//```