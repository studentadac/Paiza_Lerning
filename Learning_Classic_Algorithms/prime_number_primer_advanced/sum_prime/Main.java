//言語：Java
//問題URL：https://paiza.jp/works/mondai/prime_number_primer_advanced/prime_number_primer_advanced__sum_prime
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
    
    static boolean advanced__sum_prime(long[] n){
        
        for (int i=0;i<n.length ;i++ )
        {
            long sum=0;
            for (int j=0;j<2 ;j++ )
            {
                sum+=n[(i+j)%n.length];
            }
            
            if(primalityTest(sum))
            return true;
        }
        return false;
        
      ///  return !primalityTest(n)&&(primalityTest(n-1)||primalityTest(n+1));
    }    
    
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var n=new long[3];
        for (int i=0;i<3 ;i++ )
        {
            n[i]=sc.nextLong();
        }
        
        System.out.println(advanced__sum_prime(n)?"Yes":"No");
      
        
    }
}

//```