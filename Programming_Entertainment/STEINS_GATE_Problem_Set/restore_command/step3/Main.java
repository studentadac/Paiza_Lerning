//言語：Java
//問題URL：https://paiza.jp/works/mondai/steinsgate/restore_command_step3
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
        int m=sc.nextInt();
        sc.nextLine();
        
        var map=new HashMap<String,Integer>(n);
        for (int i=1;i<=n ;i++ )
        map.put(sc.nextLine(),i);
        
        
        var x=sc.nextLine();
        
        System.out.print(map.get(x));
        
        
    }
}
//```