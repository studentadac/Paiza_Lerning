//言語：Java
//問題URL：https://paiza.jp/works/mondai/query_primer/query_primer__single_pop
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
       
        var list = new ArrayList<Integer>(n);
        
       
        
        for (int i=0;i<n ;i++ ) 
        {
            int a=sc.nextInt();
            list.add(a);
        }
        list.remove(0);
        
          for (Integer num:list ) 
        {
            
             System.out.println(num);
        }

    }
}
//```