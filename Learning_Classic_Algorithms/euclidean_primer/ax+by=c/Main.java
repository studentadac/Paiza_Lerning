//言語：Java
//問題URL：https://paiza.jp/works/mondai/euclidean_primer/euclidean_primer__ax+by=c
//コメント：前の値の範囲が小さい同じ問題と同じコード
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var a=sc.nextInt();
        var b=sc.nextInt();
        var c=sc.nextInt();

        if(b%a==c)
            System.out.println(   -b/a  +" "+1);


        else
            System.out.println( 1 +" "+ -a/b  );

    }
}
//```