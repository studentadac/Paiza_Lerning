//言語：Java
//問題URL：https://paiza.jp/works/mondai/query_primer/query_primer__single_search
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
        
        boolean isExist=false;
        
        for (int i=0;i<n ;i++ ) 
        {
            int a=sc.nextInt();
            if(a==k)
            {
                isExist=true;
                break;
            }
            
        }
        System.out.println(isExist?"YES":"NO");
        
    
        
        
    }
}
//```