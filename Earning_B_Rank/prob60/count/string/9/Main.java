//言語：Java
//問題URL：https://paiza.jp/works/mondai/prob60/count_string_9
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        
        
        int cnt=0;
        for (int i=0;i<t.length-s.length+1    ;i++ ) 
        {
            boolean match=true;
            for (int j=0;j<s.length   ;j++ ) 
            {
                if( s[j]!=t[i+j]  )
                {
                    match=false;
                    break;
                }
                
                
            }
            
            if(match)
            ++cnt;
            
        }
        System.out.println(cnt);
        
    }
}
//```