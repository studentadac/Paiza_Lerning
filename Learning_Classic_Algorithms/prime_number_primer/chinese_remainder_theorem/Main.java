//言語：Java
//問題URL：https://paiza.jp/works/mondai/prime_number_primer/prime_number_primer__chinese_remainder_theorem
//コメント：
//コード：
//```Java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        long m1,m2,b1,b2;
        m1=sc.nextLong();
        m2=sc.nextLong();
        b1=sc.nextLong();
        b2=sc.nextLong();
        final long lim=m1*m2;
        long i;
        for ( i=b2;i<=lim ;i+=m2 )
        {
            if(i%m1==b1)
            break;
            
            
        }
        
        System.out.println(i);
        
        
        
    }
}



//```