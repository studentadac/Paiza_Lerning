//言語：Java
//問題URL：https://paiza.jp/works/mondai/skillcheck_sample/min_num
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int min=1000;
        int n=5;
        for (int i=0;i<n ;i++ )
        min=Math.min(min,sc.nextInt());

        System.out.println(min);
    }
}
//```