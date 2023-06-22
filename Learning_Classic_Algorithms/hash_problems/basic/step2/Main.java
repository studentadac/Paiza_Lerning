//言語：Java
//問題URL：https://paiza.jp/works/mondai/hash_problems/hash_problems__basic_step2
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で

        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
   
        for (int i=0;i<n ;i++ ) 
        {
            char[] s=sc.next().toCharArray();
            int cnt=0;
            for (var chara: s  ) 
            {
                 switch (chara) {
            case 'p', 'a', 'i' ,'z'-> cnt++;
           
           // default ->cnt=cnt;
        }
            }
            
           System.out.println(cnt);
            
            
            
        }
        
        
        
        
      //  System.out.println((a*sc.nextInt()+b)%mod);
    }
}
//```