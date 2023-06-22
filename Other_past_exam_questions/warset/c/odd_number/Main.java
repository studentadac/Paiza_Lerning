//言語：Java
//問題URL：https://paiza.jp/works/mondai/warset/c1_odd_number
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
        var a=new ArrayList<Integer>();
        for (int i=0;i<n ;i++ )
        {
            int x=sc.nextInt();
            if(x%2==1)
            a.add(x);
            
        }
        
        Collections.sort(a);
        for(var ans:a)
        System.out.println(ans);
        
        
    }
}
//```