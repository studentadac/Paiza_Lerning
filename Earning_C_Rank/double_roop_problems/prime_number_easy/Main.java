//言語：Java
//問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__prime_number_easy
//コメント：
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        int ans=n-1;//2からnまでを全て素数とする

        for (int i=2;i<=n ;i++ )
        
        {
           
           for (int j=2;j<i ;j++      ) 
            {
                if(i%j==0)
                {
                   
                    ans--;//割り切れた数は素数でないので除外し素数判定を終了する
                    break;
                }
                
            }
            
        }
        
        System.out.println(ans);
        
    }
}
//```