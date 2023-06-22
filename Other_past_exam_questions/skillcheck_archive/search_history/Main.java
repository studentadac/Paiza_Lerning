//言語：Java
//問題URL：https://paiza.jp/works/mondai/skillcheck_archive/search_history
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
        
        var set=new LinkedHashSet<String>();
        for (int i=0;i<n ;i++ )
        {
            var s=sc.next();
            if(set.contains(s))
            set.remove(s);
            
            set.add(s);
            
            
        }
        int setS=set.size();
        var ans=new String[setS];
        
        int i=setS-1;
        for (var s:set )
        {
            ans[i--]=s;
            
        }
        
            for (var s:ans )
        {
            System.out.println(s);
            
        }
        
        
    }
}
//```