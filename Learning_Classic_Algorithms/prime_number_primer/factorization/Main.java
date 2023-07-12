//言語：Java
//問題URL：https://paiza.jp/works/mondai/prime_number_primer/prime_number_primer__prime_factorization
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
        for (int i=2;i<=n ;i++ )
        {
            
            while(n%i==0&&n!=1)
            {
                
                System.out.println(i);
                n/=i;
                
            }
            
            
            
        }
        
    }
}
//```