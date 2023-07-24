//言語：Java
//問題URL：https://paiza.jp/works/mondai/vantan_2021/vantan_2021__q1_change
//コメント：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        int m=sc.nextInt();
        int change=m-s;
        System.out.println(change>=0?change:"Tarimasen!");
        
    }
}
//```