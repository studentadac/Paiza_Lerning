//言語：Java
//問題URL: https://paiza.jp/works/mondai/euclidean_primer/euclidean_primer__mod_calc
//コメント： マイナスの式のみ解答参照
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        long a=sc.nextLong()%n;
        
        char cal=sc.next().charAt(0);
        long b=sc.nextLong()%n;
    //    System.out.println(b);
        
        long ans=1;
        switch(cal)
        {
            case '+' -> ans=(a+b)%n;
            case '-' -> ans=((a % n) - (b % n) + n) % n ;
            case '*' -> ans=(a*b)%n;
            case '^' ->
            {
                for (int i=0;i<b ;i++ )
                {
                ans*=a; 
                ans%=n;
                }
                
            }
            
            
        }
        System.out.println(ans);
        
        
    }
}




//```