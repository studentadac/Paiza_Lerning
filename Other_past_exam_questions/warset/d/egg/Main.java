//言語：Java
//問題URL：https://paiza.jp/works/mondai/warset/d5_egg
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
        String ans;
        
        if(n<=5)
        ans="raw";
        
        else if(n<=7)
        ans="soft boiled";
        
        else
        ans="hard boiled";
        
        System.out.println(ans);
    }
}
//```