//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_011/forest_contest_011__d_prime_number
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    //素数判定関数
    public static boolean PrimeNumberTest(int n){
        
        boolean prime=true;
        for (int i=2;i*i<=n ;i++ )
        {
            if(n%i==0){
            prime=false;
            }
        }
        
        if(n==1){
            prime=false;
        }
        
        return prime;
        
    }
    
    
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        final int n=sc.nextInt();
        boolean prime=PrimeNumberTest(n);
        
        System.out.println(prime?"Yes":"No");
    }
}

//```