//言語：Java
//問題URL：https://paiza.jp/works/mondai/warset/c2_one_item
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        var s=new HashSet<String>();
     
        for (int i=0;i<n ;i++ )
        {
            String name=sc.next();
            System.out.println((s.contains(name))?"NO":"YES" );
            
            s.add(name);
            
        }
    }
}
//```