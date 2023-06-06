//言語：Java
//問題URL：https://paiza.jp/works/mondai/prob60/string_count_9
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
        char[] a=sc.nextLine().toCharArray();
        char[] s=sc.nextLine().toCharArray();
        int ans=0;
        
        for (var si:s)
        {
            if(si==a[0])
            ++ans;
        }
        
        System.out.println(ans);
        
    }
}
//```