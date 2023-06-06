//言語：Java
//問題URL：https://paiza.jp/works/mondai/query_primer/query_primer__single_insertion
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        
        var list = new ArrayList<Integer>(n+1);
        
        for (int i=0;i<n ;i++ )
        {
            list.add(sc.nextInt());
        }
        
        
        list.add(k,q);
        
        for(var num:list)
        {
            System.out.println(num);
        }
      
        
        
    }
}
//```