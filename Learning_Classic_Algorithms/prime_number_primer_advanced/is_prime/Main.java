//言語：Java
//問題URL：https://paiza.jp/works/mondai/prime_number_primer_advanced/prime_number_primer_advanced__is_prime
//コメント：
//コード：
//```Java


import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        
        if(n==1L)
        {
            System.out.println("No");
            return;
        }
        
        boolean prime=true;
        for (long i=2;i*i<=n ;i++ )
        {
            if(n%i==0)
            {
            prime=false;
            break;
                
            }
        }
        System.out.println(prime?"Yes":"No");
    }
}


//```