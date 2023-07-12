//言語：Java
//問題URL：https://paiza.jp/works/mondai/prime_number_primer/prime_number_primer__goldbach_conjecture
//コメント：数万×数万でオーバーフローしちゃうんですかね、ちょっと手間取った
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
       
       
       /*
       1. X が素数のとき is_prime[X] が true となる配列 is_prime を用意し、
    is_prime[0] , is_prime[1] を false , それ以外を true で初期化する。

2. 整数 i を 2 から順に N まで動かしながら次の操作を行う。
「is_prime[i] が true である場合、 is_prime[2×i], is_prime[3×i], ... , is_prime[k×i] を全て false にする（ただし k×i <= N ）

       */
      
       Scanner sc = new Scanner(System.in);
      // int n=100_000 ;
       
       
       
     
       
       int n=sc.nextInt();
       
         
       var b=new boolean [n+1];
       Arrays.fill(b,true);
       b[0]=b[1]=false;
       for (int i=0;i<n+1 ;i++ )
       {
           if(b[i])
           {
               for (int j=i*2;j<n+1 ;j+=i )
                    b[j]=false;
               
               
           }
           
       }
       
       long ans1=0,ans2=0;
       long max=0;
       
       
       for (int i=2;i<=n/2 ;i++ )
       {
           
        long A=i,B=n-i;
        long C=A*B;
        if(b[(int)A]&&b[(int)B] &&C>ans1*ans2    )
         {
         //    max=C;
             ans1=A;
             ans2=B;
             
         //    System.out.println(A+" "+B);
         
         }
       
       }
       
       System.out.println(ans1);
       System.out.println(ans2);
       
       
    }
}
//```