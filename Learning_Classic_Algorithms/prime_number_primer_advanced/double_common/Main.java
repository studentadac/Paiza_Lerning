//言語：Java
//問題URL：https://paiza.jp/works/mondai/prime_number_primer_advanced/prime_number_primer_advanced__double_common
//コメント：
//コード：
//```Java
import java.util.*;


public class Main {
    
     static long gcd(long a,long b       )
 {
     
       if (b == 0) {
        return a;
    }
    return gcd(b, a % b); 
 }
 
    static long lcm(long a,long b       )
 {
    return(a*b)/gcd(a,b);
 }
 
    
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       
        var A=new long[n];
   
     for (int i=0;i<n;i++ )
        {
             A[i]=sc.nextLong();
            
        }
         long GCD=A[0],LCM=A[0];
        for (int i=1;i<n;i++ )
        {
            GCD=gcd(GCD,A[i]);
            LCM=lcm(LCM,A[i]);
            
        }
        
        System.out.println(GCD+" "+LCM);
        
        
        
        
    }
}

//```