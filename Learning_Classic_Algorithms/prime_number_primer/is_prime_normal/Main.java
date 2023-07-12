//言語：Java
//問題URL：https://paiza.jp/works/mondai/prime_number_primer/prime_number_primer__is_prime_normal
//コメント:
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var n=sc.nextLong();
        boolean prime=true;
        if (n==2||n==1)
        prime=false;
        
        if(n%2==0)
        prime=false;
        
        var x=(long)Math.sqrt(n);
  //      System.out.println(x);
        for (int i=3;i<=x ;i+=2 )
        {
            prime &= n%i!=0;
            
            if(!prime)
            break;
            
            
            
        }
        
        System.out.println(prime?"YES":"NO");
        
        
    }
}
//```