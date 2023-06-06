//言語：Java
//問題URL：https://paiza.jp/works/mondai/prob60/substring_9
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(),b=sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        String s=line.substring(a-1,b);
        System.out.println(s);
    }
}
//```