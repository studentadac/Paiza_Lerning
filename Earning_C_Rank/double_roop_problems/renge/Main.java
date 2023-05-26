//言語：Java
//問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__print_range
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
        
        
        
        
        String[] s=new String[n];
        
        for (int i=0;i<n ;i++ )
        {
            
            s[i]=String.valueOf(i+1);
        }
        
        var ans=String.join(" ",s)+"\n";
        
        
        System.out.print(ans.repeat(k));

    
    }
}
//```