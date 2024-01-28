//言語：Java
//問題URL：https://paiza.jp/works/mondai/prime_number_primer_advanced/prime_number_primer_advanced__near_prime
//コメント：
//コード：
//```Java


import java.util.*;
public class Main {
    
    static boolean primalityTest(long n){
        boolean prime=true;
         if(n==1L)
        {
            prime=false;
            //return prime;
        }
        
        else
        {
        for (long i=2;i*i<=n ;i++ )
        {
            if(n%i==0)
            {
            prime=false;
            break;
                
            }
        }
        }
        return prime;
    }
    
    static boolean nearPrimalityTest(long n){
        
        return !primalityTest(n)&&(primalityTest(n-1)||primalityTest(n+1));
    }    
    
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        
        System.out.println(nearPrimalityTest(n)?"Yes":"No");
      
        
    }
}

//```