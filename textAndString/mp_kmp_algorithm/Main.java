//言語：Java
//問題URL：
//コメント：
//コード：https://paiza.jp/works/mondai/mp_kmp_algorithm/mp_kmp_algorithm__naive_step1
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var n=sc.nextInt();
        var s=sc.next();
       
        
        for (int i=0; i<n-1;i++ )
        {
            String prefix=s.substring( 0,n-i-1 );//接頭辞
            String suffix=s.substring( i+1,n);//接尾辞
            
            if(prefix.equals(suffix))
            {
                System.out.println(prefix.length());
                return;
            }
         
            
        }
      
        
        
        //すべて一致しない場合
        System.out.println(0);
        
        
        
        
        
    }
}


//```