//言語：Java
//問題URL：https://paiza.jp/works/mondai/prob60/sort_asc_1
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
        sc.nextLine();
        for (int i=0;i<n ;i++ ) 
        {
        String line = sc.nextLine();
        System.out.println( line.substring(2) );
        }
        
    }
}
//```