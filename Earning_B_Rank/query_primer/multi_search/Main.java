//言語：Java
//問題URL：https://paiza.jp/works/mondai/query_primer/query_primer__multi_search
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        var set = new HashSet<Integer>(n);
        
       
        
        for (int i=0;i<n ;i++ ) 
        {
            int a=sc.nextInt();
            set.add(a);
        }
        
          for (int i=0;i<k ;i++ ) 
        {
            int a=sc.nextInt();
            
            
             System.out.println(set.contains(a)?"YES":"NO");
        }

    }
}
//```