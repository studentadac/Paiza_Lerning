//言語：Java
//問題URL：https://paiza.jp/works/mondai/euclidean_primer/euclidean_primer__multi_gcd
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
          public static int gcd(int a,int b) {
 while(a!=0&&b!=0)
  {  if(a<b)
    b%=a;
    else
    a%=b;
  }
  
    return Math.max(a,b);
          }
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        var a=new int[n];
        
        for (int i=0;i<n ;i++ )
        {
            a[i]=sc.nextInt();

        }
        
        int ans=a[0];
          for (int i=0;i<n-1 ;i++ )
        {
           
            ans=gcd(ans,a[i+1]);
            

        }
        System.out.println(ans);
        
        
        
        
    }
}
//```