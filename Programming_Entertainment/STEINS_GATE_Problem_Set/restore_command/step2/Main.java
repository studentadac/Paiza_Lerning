//言語：Java
//問題URL：https://paiza.jp/works/mondai/steinsgate/restore_command_step2
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
        var map=new HashMap<Integer,Integer>(n);
        for (int i=1;i<=n ;i++ )
        map.put(sc.nextInt(),i);
        
        
        int x=sc.nextInt();
        
        System.out.print(map.get(x));
        
        
    }
}
//```