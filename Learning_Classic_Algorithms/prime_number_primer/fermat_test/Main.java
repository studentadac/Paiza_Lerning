//言語：Java
//問題URL：https://paiza.jp/works/mondai/prime_number_primer/prime_number_primer__fermat_test
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int a=2;
        int n=sc.nextInt();
        var f=1;
        if(n%a==0)
        {
            System.out.println("NO");
            return;
        }
        
        for(int i=0;i<n-1;i++)
        {
        f*=a;
        f%=n;
        
        
        
        }
       // System.out.println(f);
        if(f%n==1)
        System.out.println("YES");
        else
        System.out.println("NO");
        
        
//1. a を 2 から N-1 までの数からランダムに選ぶ。
//2. N が a で割り切れる場合は N は素数でないと判定する。
//3. a^(N-1) を N で割ったあまりが 1 ならば N は素数、1 でない場合は素数でないと判定する。

    }
}
//```